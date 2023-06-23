package ds.tutorial.inventory.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: InventoryService.proto")
public final class SetInventoryServiceGrpc {

  private SetInventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.tutorial.inventory.grpc.generated.SetInventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.tutorial.inventory.grpc.generated.SetInventoryRequest,
      ds.tutorial.inventory.grpc.generated.SetInventoryResponse> getSetInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setInventory",
      requestType = ds.tutorial.inventory.grpc.generated.SetInventoryRequest.class,
      responseType = ds.tutorial.inventory.grpc.generated.SetInventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.tutorial.inventory.grpc.generated.SetInventoryRequest,
      ds.tutorial.inventory.grpc.generated.SetInventoryResponse> getSetInventoryMethod() {
    io.grpc.MethodDescriptor<ds.tutorial.inventory.grpc.generated.SetInventoryRequest, ds.tutorial.inventory.grpc.generated.SetInventoryResponse> getSetInventoryMethod;
    if ((getSetInventoryMethod = SetInventoryServiceGrpc.getSetInventoryMethod) == null) {
      synchronized (SetInventoryServiceGrpc.class) {
        if ((getSetInventoryMethod = SetInventoryServiceGrpc.getSetInventoryMethod) == null) {
          SetInventoryServiceGrpc.getSetInventoryMethod = getSetInventoryMethod =
              io.grpc.MethodDescriptor.<ds.tutorial.inventory.grpc.generated.SetInventoryRequest, ds.tutorial.inventory.grpc.generated.SetInventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.tutorial.inventory.grpc.generated.SetInventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.tutorial.inventory.grpc.generated.SetInventoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetInventoryServiceMethodDescriptorSupplier("setInventory"))
              .build();
        }
      }
    }
    return getSetInventoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetInventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetInventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetInventoryServiceStub>() {
        @java.lang.Override
        public SetInventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetInventoryServiceStub(channel, callOptions);
        }
      };
    return SetInventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetInventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetInventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetInventoryServiceBlockingStub>() {
        @java.lang.Override
        public SetInventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetInventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return SetInventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetInventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetInventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetInventoryServiceFutureStub>() {
        @java.lang.Override
        public SetInventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetInventoryServiceFutureStub(channel, callOptions);
        }
      };
    return SetInventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SetInventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setInventory(ds.tutorial.inventory.grpc.generated.SetInventoryRequest request,
        io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.SetInventoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInventoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetInventoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.tutorial.inventory.grpc.generated.SetInventoryRequest,
                ds.tutorial.inventory.grpc.generated.SetInventoryResponse>(
                  this, METHODID_SET_INVENTORY)))
          .build();
    }
  }

  /**
   */
  public static final class SetInventoryServiceStub extends io.grpc.stub.AbstractAsyncStub<SetInventoryServiceStub> {
    private SetInventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetInventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetInventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void setInventory(ds.tutorial.inventory.grpc.generated.SetInventoryRequest request,
        io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.SetInventoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInventoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SetInventoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SetInventoryServiceBlockingStub> {
    private SetInventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetInventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetInventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.tutorial.inventory.grpc.generated.SetInventoryResponse setInventory(ds.tutorial.inventory.grpc.generated.SetInventoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInventoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SetInventoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SetInventoryServiceFutureStub> {
    private SetInventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetInventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetInventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.tutorial.inventory.grpc.generated.SetInventoryResponse> setInventory(
        ds.tutorial.inventory.grpc.generated.SetInventoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInventoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_INVENTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SetInventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SetInventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_INVENTORY:
          serviceImpl.setInventory((ds.tutorial.inventory.grpc.generated.SetInventoryRequest) request,
              (io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.SetInventoryResponse>) responseObserver);
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

  private static abstract class SetInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SetInventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.tutorial.inventory.grpc.generated.InventoryService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SetInventoryService");
    }
  }

  private static final class SetInventoryServiceFileDescriptorSupplier
      extends SetInventoryServiceBaseDescriptorSupplier {
    SetInventoryServiceFileDescriptorSupplier() {}
  }

  private static final class SetInventoryServiceMethodDescriptorSupplier
      extends SetInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SetInventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SetInventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SetInventoryServiceFileDescriptorSupplier())
              .addMethod(getSetInventoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
