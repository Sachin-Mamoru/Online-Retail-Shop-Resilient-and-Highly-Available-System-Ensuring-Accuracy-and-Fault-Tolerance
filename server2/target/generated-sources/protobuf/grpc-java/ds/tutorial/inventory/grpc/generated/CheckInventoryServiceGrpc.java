package ds.tutorial.inventory.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: InventoryService.proto")
public final class CheckInventoryServiceGrpc {

  private CheckInventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.tutorial.inventory.grpc.generated.CheckInventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.tutorial.inventory.grpc.generated.CheckInventoryRequest,
      ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> getCheckInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkInventory",
      requestType = ds.tutorial.inventory.grpc.generated.CheckInventoryRequest.class,
      responseType = ds.tutorial.inventory.grpc.generated.CheckInventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.tutorial.inventory.grpc.generated.CheckInventoryRequest,
      ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> getCheckInventoryMethod() {
    io.grpc.MethodDescriptor<ds.tutorial.inventory.grpc.generated.CheckInventoryRequest, ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> getCheckInventoryMethod;
    if ((getCheckInventoryMethod = CheckInventoryServiceGrpc.getCheckInventoryMethod) == null) {
      synchronized (CheckInventoryServiceGrpc.class) {
        if ((getCheckInventoryMethod = CheckInventoryServiceGrpc.getCheckInventoryMethod) == null) {
          CheckInventoryServiceGrpc.getCheckInventoryMethod = getCheckInventoryMethod =
              io.grpc.MethodDescriptor.<ds.tutorial.inventory.grpc.generated.CheckInventoryRequest, ds.tutorial.inventory.grpc.generated.CheckInventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.tutorial.inventory.grpc.generated.CheckInventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.tutorial.inventory.grpc.generated.CheckInventoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CheckInventoryServiceMethodDescriptorSupplier("checkInventory"))
              .build();
        }
      }
    }
    return getCheckInventoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckInventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckInventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckInventoryServiceStub>() {
        @java.lang.Override
        public CheckInventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckInventoryServiceStub(channel, callOptions);
        }
      };
    return CheckInventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckInventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckInventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckInventoryServiceBlockingStub>() {
        @java.lang.Override
        public CheckInventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckInventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return CheckInventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckInventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckInventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckInventoryServiceFutureStub>() {
        @java.lang.Override
        public CheckInventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckInventoryServiceFutureStub(channel, callOptions);
        }
      };
    return CheckInventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CheckInventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkInventory(ds.tutorial.inventory.grpc.generated.CheckInventoryRequest request,
        io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckInventoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckInventoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.tutorial.inventory.grpc.generated.CheckInventoryRequest,
                ds.tutorial.inventory.grpc.generated.CheckInventoryResponse>(
                  this, METHODID_CHECK_INVENTORY)))
          .build();
    }
  }

  /**
   */
  public static final class CheckInventoryServiceStub extends io.grpc.stub.AbstractAsyncStub<CheckInventoryServiceStub> {
    private CheckInventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckInventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckInventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkInventory(ds.tutorial.inventory.grpc.generated.CheckInventoryRequest request,
        io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckInventoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CheckInventoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CheckInventoryServiceBlockingStub> {
    private CheckInventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckInventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckInventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.tutorial.inventory.grpc.generated.CheckInventoryResponse checkInventory(ds.tutorial.inventory.grpc.generated.CheckInventoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckInventoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CheckInventoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CheckInventoryServiceFutureStub> {
    private CheckInventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckInventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckInventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> checkInventory(
        ds.tutorial.inventory.grpc.generated.CheckInventoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckInventoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_INVENTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckInventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckInventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_INVENTORY:
          serviceImpl.checkInventory((ds.tutorial.inventory.grpc.generated.CheckInventoryRequest) request,
              (io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.CheckInventoryResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CheckInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckInventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.tutorial.inventory.grpc.generated.InventoryService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CheckInventoryService");
    }
  }

  private static final class CheckInventoryServiceFileDescriptorSupplier
      extends CheckInventoryServiceBaseDescriptorSupplier {
    CheckInventoryServiceFileDescriptorSupplier() {}
  }

  private static final class CheckInventoryServiceMethodDescriptorSupplier
      extends CheckInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckInventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckInventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckInventoryServiceFileDescriptorSupplier())
              .addMethod(getCheckInventoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
