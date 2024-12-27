package com.learning.sde.grpc.greeting.blog.client;

import com.proto.blog.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BlogClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel =
                ManagedChannelBuilder.forAddress("localhost", 50051)
                        .usePlaintext()
                        .build();

        BlogServiceGrpc.BlogServiceBlockingStub blogClient =
                BlogServiceGrpc.newBlockingStub(managedChannel);

        Blog blog = Blog.newBuilder()
                .setAuthorId("Athul")
                .setTitle("New Blog.")
                .setContent("!! Hello World !!")
                .build();

        CreateBlogResponse response = blogClient.createBlog(CreateBlogRequest.newBuilder()
                        .setBlog(blog).build());
        System.out.println("Received response for blog: " + response.toString());

        String blogId = response.getBlog().getId();
        System.out.println("Reading blog: " + blogId);
        ReadBlogResponse readBlogResponse = blogClient.readBlog(ReadBlogRequest.newBuilder()
                .setBlogId(blogId).build());
        System.out.println(readBlogResponse.toString());

        // trigger error code.
//        System.out.println("Reading invalid blog.");
//        ReadBlogResponse readBlogResponse1 = blogClient.readBlog(ReadBlogRequest.newBuilder()
//                .setBlogId("776e37cbf03059627d887fcd").build());

    }
}
