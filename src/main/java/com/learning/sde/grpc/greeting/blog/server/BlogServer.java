package com.learning.sde.grpc.greeting.blog.server;

import com.learning.sde.grpc.greeting.server.GreetServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BlogServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello GRPC");

        Server server = ServerBuilder.forPort(50051)
                .addService(new BlogServiceImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Stopped the server");
        }));
        server.awaitTermination();
    }
}
