package grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Subscribers.proto")
public final class MessagingServiceGrpc {

  private MessagingServiceGrpc() {}

  public static final String SERVICE_NAME = "MessagingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.stub.Subscribers.Nickname,
      grpc.stub.Subscribers.ServerResponse> getSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subscription",
      requestType = grpc.stub.Subscribers.Nickname.class,
      responseType = grpc.stub.Subscribers.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.stub.Subscribers.Nickname,
      grpc.stub.Subscribers.ServerResponse> getSubscriptionMethod() {
    io.grpc.MethodDescriptor<grpc.stub.Subscribers.Nickname, grpc.stub.Subscribers.ServerResponse> getSubscriptionMethod;
    if ((getSubscriptionMethod = MessagingServiceGrpc.getSubscriptionMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getSubscriptionMethod = MessagingServiceGrpc.getSubscriptionMethod) == null) {
          MessagingServiceGrpc.getSubscriptionMethod = getSubscriptionMethod = 
              io.grpc.MethodDescriptor.<grpc.stub.Subscribers.Nickname, grpc.stub.Subscribers.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MessagingService", "subscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.stub.Subscribers.Nickname.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.stub.Subscribers.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("subscription"))
                  .build();
          }
        }
     }
     return getSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.stub.Subscribers.Empty,
      grpc.stub.Subscribers.connectedUser> getShowonlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showonline",
      requestType = grpc.stub.Subscribers.Empty.class,
      responseType = grpc.stub.Subscribers.connectedUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.stub.Subscribers.Empty,
      grpc.stub.Subscribers.connectedUser> getShowonlineMethod() {
    io.grpc.MethodDescriptor<grpc.stub.Subscribers.Empty, grpc.stub.Subscribers.connectedUser> getShowonlineMethod;
    if ((getShowonlineMethod = MessagingServiceGrpc.getShowonlineMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getShowonlineMethod = MessagingServiceGrpc.getShowonlineMethod) == null) {
          MessagingServiceGrpc.getShowonlineMethod = getShowonlineMethod = 
              io.grpc.MethodDescriptor.<grpc.stub.Subscribers.Empty, grpc.stub.Subscribers.connectedUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MessagingService", "showonline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.stub.Subscribers.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.stub.Subscribers.connectedUser.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("showonline"))
                  .build();
          }
        }
     }
     return getShowonlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.stub.Subscribers.content,
      grpc.stub.Subscribers.content> getChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chat",
      requestType = grpc.stub.Subscribers.content.class,
      responseType = grpc.stub.Subscribers.content.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.stub.Subscribers.content,
      grpc.stub.Subscribers.content> getChatMethod() {
    io.grpc.MethodDescriptor<grpc.stub.Subscribers.content, grpc.stub.Subscribers.content> getChatMethod;
    if ((getChatMethod = MessagingServiceGrpc.getChatMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getChatMethod = MessagingServiceGrpc.getChatMethod) == null) {
          MessagingServiceGrpc.getChatMethod = getChatMethod = 
              io.grpc.MethodDescriptor.<grpc.stub.Subscribers.content, grpc.stub.Subscribers.content>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MessagingService", "chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.stub.Subscribers.content.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.stub.Subscribers.content.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("chat"))
                  .build();
          }
        }
     }
     return getChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagingServiceStub newStub(io.grpc.Channel channel) {
    return new MessagingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessagingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessagingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MessagingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void subscription(grpc.stub.Subscribers.Nickname request,
        io.grpc.stub.StreamObserver<grpc.stub.Subscribers.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void showonline(grpc.stub.Subscribers.Empty request,
        io.grpc.stub.StreamObserver<grpc.stub.Subscribers.connectedUser> responseObserver) {
      asyncUnimplementedUnaryCall(getShowonlineMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.stub.Subscribers.content> chat(
        io.grpc.stub.StreamObserver<grpc.stub.Subscribers.content> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.stub.Subscribers.Nickname,
                grpc.stub.Subscribers.ServerResponse>(
                  this, METHODID_SUBSCRIPTION)))
          .addMethod(
            getShowonlineMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.stub.Subscribers.Empty,
                grpc.stub.Subscribers.connectedUser>(
                  this, METHODID_SHOWONLINE)))
          .addMethod(
            getChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.stub.Subscribers.content,
                grpc.stub.Subscribers.content>(
                  this, METHODID_CHAT)))
          .build();
    }
  }

  /**
   */
  public static final class MessagingServiceStub extends io.grpc.stub.AbstractStub<MessagingServiceStub> {
    private MessagingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingServiceStub(channel, callOptions);
    }

    /**
     */
    public void subscription(grpc.stub.Subscribers.Nickname request,
        io.grpc.stub.StreamObserver<grpc.stub.Subscribers.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showonline(grpc.stub.Subscribers.Empty request,
        io.grpc.stub.StreamObserver<grpc.stub.Subscribers.connectedUser> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getShowonlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.stub.Subscribers.content> chat(
        io.grpc.stub.StreamObserver<grpc.stub.Subscribers.content> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MessagingServiceBlockingStub extends io.grpc.stub.AbstractStub<MessagingServiceBlockingStub> {
    private MessagingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.stub.Subscribers.ServerResponse subscription(grpc.stub.Subscribers.Nickname request) {
      return blockingUnaryCall(
          getChannel(), getSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.stub.Subscribers.connectedUser> showonline(
        grpc.stub.Subscribers.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getShowonlineMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessagingServiceFutureStub extends io.grpc.stub.AbstractStub<MessagingServiceFutureStub> {
    private MessagingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.stub.Subscribers.ServerResponse> subscription(
        grpc.stub.Subscribers.Nickname request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIPTION = 0;
  private static final int METHODID_SHOWONLINE = 1;
  private static final int METHODID_CHAT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIPTION:
          serviceImpl.subscription((grpc.stub.Subscribers.Nickname) request,
              (io.grpc.stub.StreamObserver<grpc.stub.Subscribers.ServerResponse>) responseObserver);
          break;
        case METHODID_SHOWONLINE:
          serviceImpl.showonline((grpc.stub.Subscribers.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.stub.Subscribers.connectedUser>) responseObserver);
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
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<grpc.stub.Subscribers.content>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.stub.Subscribers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessagingService");
    }
  }

  private static final class MessagingServiceFileDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier {
    MessagingServiceFileDescriptorSupplier() {}
  }

  private static final class MessagingServiceMethodDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessagingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagingServiceFileDescriptorSupplier())
              .addMethod(getSubscriptionMethod())
              .addMethod(getShowonlineMethod())
              .addMethod(getChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
