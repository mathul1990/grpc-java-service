package com.learning.sde.grpc.greeting.calculator;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;

public class CalculatorServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Calculator server");
        Server server = ServerBuilder.forPort(50052)
                .addService(new CalculatorServiceImpl())
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
