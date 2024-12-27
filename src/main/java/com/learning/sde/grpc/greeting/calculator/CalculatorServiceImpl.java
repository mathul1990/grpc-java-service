package com.learning.sde.grpc.greeting.calculator;

import com.proto.calculator.*;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        int result = request.getFirst() + request.getSecond();
        SumResponse response = SumResponse.newBuilder()
                .setResult(Integer.toString(result))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void decomposition(PrimeNumberDecompositionRequest request, StreamObserver<PrimeNumberDecompositionResponse> responseObserver) {
        int n = request.getNumber();
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                n = n / divisor;
                // After finding out each factor we are returning the factor, instead of
                // storing it in a list. If n is large, this will give quicker responses.
                responseObserver.onNext(PrimeNumberDecompositionResponse.newBuilder()
                        .setFactor(divisor).build());
            } else {
                divisor++;
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ComputeAverageRequest> computeAverage(StreamObserver<ComputeAverageResponse> responseObserver) {
        StreamObserver<ComputeAverageRequest> requestStreamObserver =
                new StreamObserver<ComputeAverageRequest>() {
                    double average = 0.0;
                    int sum = 0;
                    int count = 1;
                    @Override
                    public void onNext(ComputeAverageRequest value) {
                        // Client sends a message.
                        int n = value.getNumber();
                        System.out.println("Received number: " + n);
                        sum += n;
                        average = (double) sum/count;
                        count++;
                        System.out.println("Sum: " + n + ", avg: " + average);
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Client sends Error.
                    }

                    @Override
                    public void onCompleted() {
                        // Client is done.
                        // This is when we want to return a response.

                        // We can calculate average here at the last step as well, based on sum
                        // and count.
                        responseObserver.onNext(ComputeAverageResponse.newBuilder()
                                        .setAverage(average).build());
                        responseObserver.onCompleted();
                    }
                };
        return requestStreamObserver;
    }

    @Override
    public StreamObserver<FindMaxRequest> findMax(StreamObserver<FindMaxResponse> responseObserver) {
        StreamObserver<FindMaxRequest> requestStreamObserver =
                new StreamObserver<FindMaxRequest>() {
                    Integer max = Integer.MIN_VALUE;
                    @Override
                    public void onNext(FindMaxRequest value) {
                        int n = value.getNumber();
                        max = Math.max(n, max);
                        System.out.println("Current max: " + max);
                        responseObserver.onNext(FindMaxResponse.newBuilder()
                                .setMax(max).build());
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onCompleted() {
                        responseObserver.onCompleted();
                    }
                };
        return requestStreamObserver;
    }
}
