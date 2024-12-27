package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: calculator/calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.SumRequest,
      com.proto.calculator.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.calculator.SumRequest.class,
      responseType = com.proto.calculator.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.SumRequest,
      com.proto.calculator.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.SumRequest, com.proto.calculator.SumResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.SumRequest, com.proto.calculator.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberDecompositionRequest,
      com.proto.calculator.PrimeNumberDecompositionResponse> getDecompositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decomposition",
      requestType = com.proto.calculator.PrimeNumberDecompositionRequest.class,
      responseType = com.proto.calculator.PrimeNumberDecompositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberDecompositionRequest,
      com.proto.calculator.PrimeNumberDecompositionResponse> getDecompositionMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberDecompositionRequest, com.proto.calculator.PrimeNumberDecompositionResponse> getDecompositionMethod;
    if ((getDecompositionMethod = CalculatorServiceGrpc.getDecompositionMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDecompositionMethod = CalculatorServiceGrpc.getDecompositionMethod) == null) {
          CalculatorServiceGrpc.getDecompositionMethod = getDecompositionMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.PrimeNumberDecompositionRequest, com.proto.calculator.PrimeNumberDecompositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decomposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeNumberDecompositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeNumberDecompositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Decomposition"))
              .build();
        }
      }
    }
    return getDecompositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getComputeAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ComputeAverage",
      requestType = com.proto.calculator.ComputeAverageRequest.class,
      responseType = com.proto.calculator.ComputeAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getComputeAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest, com.proto.calculator.ComputeAverageResponse> getComputeAverageMethod;
    if ((getComputeAverageMethod = CalculatorServiceGrpc.getComputeAverageMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getComputeAverageMethod = CalculatorServiceGrpc.getComputeAverageMethod) == null) {
          CalculatorServiceGrpc.getComputeAverageMethod = getComputeAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.ComputeAverageRequest, com.proto.calculator.ComputeAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ComputeAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ComputeAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ComputeAverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("ComputeAverage"))
              .build();
        }
      }
    }
    return getComputeAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.FindMaxRequest,
      com.proto.calculator.FindMaxResponse> getFindMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMax",
      requestType = com.proto.calculator.FindMaxRequest.class,
      responseType = com.proto.calculator.FindMaxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.FindMaxRequest,
      com.proto.calculator.FindMaxResponse> getFindMaxMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.FindMaxRequest, com.proto.calculator.FindMaxResponse> getFindMaxMethod;
    if ((getFindMaxMethod = CalculatorServiceGrpc.getFindMaxMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindMaxMethod = CalculatorServiceGrpc.getFindMaxMethod) == null) {
          CalculatorServiceGrpc.getFindMaxMethod = getFindMaxMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.FindMaxRequest, com.proto.calculator.FindMaxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindMax"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.FindMaxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.FindMaxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("FindMax"))
              .build();
        }
      }
    }
    return getFindMaxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    default void sum(com.proto.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    default void decomposition(com.proto.calculator.PrimeNumberDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeNumberDecompositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecompositionMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageRequest> computeAverage(
        io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getComputeAverageMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.proto.calculator.FindMaxRequest> findMax(
        io.grpc.stub.StreamObserver<com.proto.calculator.FindMaxResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFindMaxMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CalculatorService.
   */
  public static abstract class CalculatorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CalculatorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CalculatorService.
   */
  public static final class CalculatorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void sum(com.proto.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decomposition(com.proto.calculator.PrimeNumberDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeNumberDecompositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDecompositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageRequest> computeAverage(
        io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getComputeAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.FindMaxRequest> findMax(
        io.grpc.stub.StreamObserver<com.proto.calculator.FindMaxResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFindMaxMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CalculatorService.
   */
  public static final class CalculatorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.calculator.SumResponse sum(com.proto.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.PrimeNumberDecompositionResponse> decomposition(
        com.proto.calculator.PrimeNumberDecompositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDecompositionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CalculatorService.
   */
  public static final class CalculatorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.SumResponse> sum(
        com.proto.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_DECOMPOSITION = 1;
  private static final int METHODID_COMPUTE_AVERAGE = 2;
  private static final int METHODID_FIND_MAX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.calculator.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse>) responseObserver);
          break;
        case METHODID_DECOMPOSITION:
          serviceImpl.decomposition((com.proto.calculator.PrimeNumberDecompositionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.PrimeNumberDecompositionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPUTE_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.computeAverage(
              (io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse>) responseObserver);
        case METHODID_FIND_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMax(
              (io.grpc.stub.StreamObserver<com.proto.calculator.FindMaxResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.proto.calculator.SumRequest,
              com.proto.calculator.SumResponse>(
                service, METHODID_SUM)))
        .addMethod(
          getDecompositionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.proto.calculator.PrimeNumberDecompositionRequest,
              com.proto.calculator.PrimeNumberDecompositionResponse>(
                service, METHODID_DECOMPOSITION)))
        .addMethod(
          getComputeAverageMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.proto.calculator.ComputeAverageRequest,
              com.proto.calculator.ComputeAverageResponse>(
                service, METHODID_COMPUTE_AVERAGE)))
        .addMethod(
          getFindMaxMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.proto.calculator.FindMaxRequest,
              com.proto.calculator.FindMaxResponse>(
                service, METHODID_FIND_MAX)))
        .build();
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CalculatorServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getDecompositionMethod())
              .addMethod(getComputeAverageMethod())
              .addMethod(getFindMaxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
