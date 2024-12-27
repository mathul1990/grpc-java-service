package com.learning.sde.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("GRPC Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
//          dummy impl
//        DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
//        DummyServiceGrpc.DummyServiceFutureStub asyncClient = DummyServiceGrpc.newFutureStub(channel);

        // Greet service client which is blocking ie synchronous.
        GreetServiceGrpc.GreetServiceBlockingStub greetServiceClient =
                GreetServiceGrpc.newBlockingStub(channel);
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Athul")
                .setLastName("Murali")
                .build();

          /* Unary */

//        GreetRequest greetRequest = GreetRequest.newBuilder()
//                .setGreeting(greeting)
//                .build();
//
//        // Call the RPC and get response.
//        GreetResponse greetResponse = greetServiceClient.greet(greetRequest);
//        System.out.println(greetResponse.getResult());

        /* Server Streaming */

//        GreetManyTimesRequest greetManyTimesRequest =
//                GreetManyTimesRequest.newBuilder()
//                        .setGreeting(greeting)
//                        .build();
//        greetServiceClient.greetManyTimes(greetManyTimesRequest)
//                .forEachRemaining(greetManyTimesResponse -> {
//                    System.out.println(greetManyTimesResponse.getResult());
//                });

        /* Client Streaming */
        // For client streaming we need async client.

//        GreetServiceGrpc.GreetServiceStub asyncClient =
//                GreetServiceGrpc.newStub(channel);
//
//        // To block the thread, since we are using async methods here.
//        CountDownLatch latch = new CountDownLatch(1);
//
//        StreamObserver<LongGreetRequest> requestObserver =
//                asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
//            @Override
//            public void onNext(LongGreetResponse value) {
//                // We get response from server.
//                System.out.println("Received response from server: " + value.getResult());
//                // onNext will be called only once.
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                // We get error from server.
//            }
//
//            @Override
//            public void onCompleted() {
//                // Server is completed sending data.
//                // onCompleted will be called right after onNext.
//                System.out.println("Server completed sending messages.");
//                // Decrement latch count.
//                latch.countDown();
//            }
//        });
//
//        Greeting greeting1 = Greeting.newBuilder()
//                .setFirstName("Sachin")
//                .build();
//
//        Greeting greeting2 = Greeting.newBuilder()
//                .setFirstName("Messi")
//                .build();
//
//        // streaming msg 1
//        System.out.println("Sending msg 1");
//        requestObserver.onNext(LongGreetRequest.newBuilder()
//                        .setGreeting(greeting)
//                .build());
//
//        // streaming msg 2
//        System.out.println("Sending msg 2");
//        requestObserver.onNext(LongGreetRequest.newBuilder()
//                .setGreeting(greeting1)
//                .build());
//
//        // streaming msg 3
//        System.out.println("Sending msg 3");
//        requestObserver.onNext(LongGreetRequest.newBuilder()
//                .setGreeting(greeting2)
//                .build());
//
//        // tell server that client has done sending data.
//        requestObserver.onCompleted();
//
//        // wait till latch is zero, ie when server is done sending message.
//        // Without this, client program exits immediately ie with out waiting for server to send
//        // messages.
//        latch.await(3L, TimeUnit.SECONDS);


        /* Bidirectional streaming */
        GreetServiceGrpc.GreetServiceStub stub = GreetServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetEveryoneRequest> requestStreamObserver =
                stub.greetEveryOne(new StreamObserver<GreetEveryoneResponse>() {
                    @Override
                    public void onNext(GreetEveryoneResponse value) {
                        System.out.println("Response from server: " + value.getResult());
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

        Arrays.asList("Athul", "Sachin", "Messi", "R9").forEach(
                name -> {
                    System.out.println("Sending: " + name);
                    requestStreamObserver.onNext(GreetEveryoneRequest.newBuilder().
                            setGreeting(Greeting.newBuilder().setFirstName(name))
                            .build());
                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
        );
        requestStreamObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Shutting down channel");
        channel.shutdown();
    }

}
