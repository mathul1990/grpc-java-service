package com.learning.sde.grpc.greeting.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

        // create response.
        String result = "\nHello " + firstName + "\n";
        GreetResponse greetResponse = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        //send response.
        responseObserver.onNext(greetResponse);

        // complete RPC.
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
        String firstName = request.getGreeting().getFirstName();

        try {
            for (int i = 0; i < 10; i++) {
                String result = "Hello " + firstName + " no: " + i;
                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {
        StreamObserver<LongGreetRequest> requestObserver = new StreamObserver<LongGreetRequest>() {
            String result = "";
            @Override
            public void onNext(LongGreetRequest value) {
                // Client sends a message.
                result += "Hello " + value.getGreeting().getFirstName() + "!";
            }

            @Override
            public void onError(Throwable t) {
                // Client sends an error.
            }

            @Override
            public void onCompleted() {
                // Client is done.
                // This is when we want to return a response.
                responseObserver.onNext(
                        LongGreetResponse.newBuilder()
                                .setResult(result)
                                .build());
                responseObserver.onCompleted();
            }
        };
        return requestObserver;
    }

    // in this eg: server responds to every message. but server is free to choose how many responses
    // to send for each client message.
    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryOne(StreamObserver<GreetEveryoneResponse> responseObserver) {
        // The syntax is same as client streaming.
        // Difference is responseObserver will be called multiple times here.
        StreamObserver<GreetEveryoneRequest> requestStreamObserver =
                new StreamObserver<GreetEveryoneRequest>() {
                    @Override
                    public void onNext(GreetEveryoneRequest value) {
                        // In this case, every time we get a GreetEveryoneRequest,
                        // we will return a GreetEveryoneResponse. This is not mandatory for
                        // bidirectional streaming.
                        String response = "Hello" + value.getGreeting().getFirstName() + " ";
                        System.out.println("Server Responding with: " + response);
                        GreetEveryoneResponse greetEveryoneResponse =
                                GreetEveryoneResponse.newBuilder()
                                        .setResult(response)
                                        .build();
                        responseObserver.onNext(greetEveryoneResponse);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onCompleted() {
                        // Whenever client says it is done sending data, server also stops sending data.
                        responseObserver.onCompleted();
                    }
                };
        return requestStreamObserver;
    }
}
