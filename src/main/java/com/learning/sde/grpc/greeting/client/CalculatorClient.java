package com.learning.sde.grpc.greeting.client;

import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel =
                ManagedChannelBuilder.forAddress("localhost", 50052)
                        .usePlaintext()
                        .build();
        CalculatorServiceGrpc.CalculatorServiceBlockingStub client =
                CalculatorServiceGrpc.newBlockingStub(managedChannel);
        // Unary
//        SumRequest request = SumRequest.newBuilder()
//                .setFirst(5)
//                .setSecond(6)
//                .build();
//        SumResponse response = client.sum(request);
//        System.out.println(" Sum = " + response.getResult());

        // Server Streaming
//        PrimeNumberDecompositionRequest request = PrimeNumberDecompositionRequest.newBuilder()
//                .setNumber(100)
//                .build();
//        client.decomposition(request)
//                        .forEachRemaining(primeNumberDecompositionResponse -> {
//                            System.out.println(primeNumberDecompositionResponse.getFactor());
//                        });

        // Client Streaming
//        CalculatorServiceGrpc.CalculatorServiceStub asyncClient =
//                CalculatorServiceGrpc.newStub(managedChannel);
//        CountDownLatch latch = new CountDownLatch(1);
//        StreamObserver<ComputeAverageRequest> requestStreamObserver =
//                asyncClient.computeAverage(new StreamObserver<ComputeAverageResponse>() {
//                    @Override
//                    public void onNext(ComputeAverageResponse value) {
//                        // We get response from server.
//                        System.out.println("Received response from server: " + value.getAverage());
//                        // onNext will be called only once.
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//                        // We get error from server.
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        System.out.println("Server completed sending messages.");
//                        latch.countDown();
//                    }
//                });
//
////        ComputeAverageRequest request1 = ComputeAverageRequest.newBuilder()
////                .setNumber(1)
////                .build();
////
////        ComputeAverageRequest request2 = ComputeAverageRequest.newBuilder()
////                .setNumber(2)
////                .build();
////        ComputeAverageRequest request3 = ComputeAverageRequest.newBuilder()
////                .setNumber(3)
////                .build();
////
////        requestStreamObserver.onNext(request1);
////        requestStreamObserver.onNext(request2);
////        requestStreamObserver.onNext(request3);
//
//        for (int i = 0; i < 10000; i++) {
//            requestStreamObserver.onNext(ComputeAverageRequest.newBuilder()
//                            .setNumber(i).build());
//        }
//
//        requestStreamObserver.onCompleted();
//
//        latch.await(3L, TimeUnit.SECONDS);


        // Bidirectional Streaming.
        CalculatorServiceGrpc.CalculatorServiceStub stub =
                CalculatorServiceGrpc.newStub(managedChannel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaxRequest> requestStreamObserver =
                stub.findMax(new StreamObserver<FindMaxResponse>() {
                    @Override
                    public void onNext(FindMaxResponse value) {
                        System.out.println("Received max: " + value.getMax());
                    }

                    @Override
                    public void onError(Throwable t) {
                        latch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Server is done sending data");
                        latch.countDown();
                    }
                });

        Arrays.asList(100, 10, 200, 201, 300, 50)
                .forEach(n -> {
                    System.out.println("Sending num: " + n);
                    requestStreamObserver.onNext(FindMaxRequest.newBuilder()
                                    .setNumber(n).build());
                });

        requestStreamObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        managedChannel.shutdown();
    }
}
