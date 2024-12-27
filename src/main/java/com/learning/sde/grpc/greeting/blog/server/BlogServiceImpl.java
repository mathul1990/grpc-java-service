package com.learning.sde.grpc.greeting.blog.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.proto.blog.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

public class BlogServiceImpl extends BlogServiceGrpc.BlogServiceImplBase {

    private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    // Creates db named mydb.
    private MongoDatabase database = mongoClient.getDatabase("mydb");
    //In mongodb tables are called collections. This creates collection named blog in the db.
    private MongoCollection<Document> collection = database.getCollection("blog");
    @Override
    public void createBlog(CreateBlogRequest request, StreamObserver<CreateBlogResponse> responseObserver) {

        System.out.println("Received blog");
        Blog blog = request.getBlog();

        Document document = new Document("author_id", blog.getAuthorId())
                .append("title", blog.getTitle())
                .append("content", blog.getContent());

        // insert the document to mongodb.
        System.out.println("Inserting blog");
        collection.insertOne(document);

        // get id of the doc from mongo.
        String id = document.getObjectId("_id").toString();
        System.out.println("Inserted blog, id: " + id);

        CreateBlogResponse response = CreateBlogResponse.newBuilder().
                setBlog(blog.toBuilder().setId(id).build())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void readBlog(ReadBlogRequest request, StreamObserver<ReadBlogResponse> responseObserver) {
        String blogId = request.getBlogId();

        Document result = null;

        try {
            result = collection.find(Filters.eq("_id", new ObjectId(blogId)))
                    .first();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("Blog for given id not found")
                            .asRuntimeException());
        }

        if (result == null) {
            System.out.println("Blog not found");
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("Blog for given id not found")
                            .asRuntimeException()
            );
        } else {
            System.out.println("Blog found");
            Blog blog = Blog.newBuilder()
                    .setAuthorId(result.getString("author_id"))
                    .setTitle(result.getString("title"))
                    .setContent(result.getString("content"))
                    .setId(blogId)
                    .build();
            /* To update the document.
            Document doc = // updated doc.
            collection.replaceOne("_id", result.getObjectId("_id"), doc);*/

            responseObserver.onNext(ReadBlogResponse.newBuilder()
                            .setBlog(blog).build());
            responseObserver.onCompleted();
        }
    }
}
