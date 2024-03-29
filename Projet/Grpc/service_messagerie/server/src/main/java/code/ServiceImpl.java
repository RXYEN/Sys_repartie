package code;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import grpc.stub.MessagingServiceGrpc.MessagingServiceImplBase;
import grpc.stub.Service.*;
import io.grpc.stub.StreamObserver;



public class ServiceImpl extends MessagingServiceImplBase {
    List<String> clientsNameList = new ArrayList<String>();
    Map<String, StreamObserver<content>> clients = new ConcurrentHashMap<String,StreamObserver<content>>();
    ServiceImpl() {
        super();
    }
    @Override
    public void subscription(Nickname request, StreamObserver<ServerResponse> responseObserver) {
        if(clientsNameList.contains(request.getUsername())){
            ServerResponse.Builder response = ServerResponse.newBuilder();
            response.setMessage("username already taken")
                    .setCode(200);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted(); 
        }else
        {
            clientsNameList.add(request.getUsername());
            ServerResponse.Builder response = ServerResponse.newBuilder();
            response.setMessage("successfully registered")
                    .setCode(100);
            System.out.println("User " + request.getUsername() + " connected");
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void showonline(Empty request, StreamObserver<connectedUser> responseObserver) {
        connectedUser.Builder response = connectedUser.newBuilder();
        for(String user : clientsNameList){
            response.setUser(user);
            responseObserver.onNext(response.build());
        }
        responseObserver.onCompleted();

    }
    
        @Override
        public StreamObserver<content> chat(StreamObserver<content> responseObserver){
            return new StreamObserver<content>(){
                String destinationUser = "";
                @Override
                public void onNext(content request){
                    if(!clients.containsValue(responseObserver)){
                        clients.put(request.getMessage(),responseObserver);
                        destinationUser = request.getMessage(); 
                        return;
                    }
                    if(clientsNameList.contains(request.getDestination())){
                        clients.get(request.getDestination()).onNext(request);
                        System.out.println(request.getSource() + " sent a message to " + request.getDestination() );
                    }else{
                        System.out.println(request.getSource()+" tried to send a message to an unexistent user");
                        content response = content.newBuilder().setMessage("User not found").setSource("Server").setDestination(request.getSource()).build();
                        responseObserver.onNext(response);
                    }
                }
                @Override
                public void onError(Throwable t){
                    System.out.println("Error: " + t.getMessage());
                    clients.remove(destinationUser);
                    clientsNameList.remove(destinationUser);
                    System.out.println("User " + destinationUser + " made an Error and was disconnected ");
                }
                @Override
                public void onCompleted(){
                    responseObserver.onCompleted();
                    clients.remove(destinationUser);
                    clientsNameList.remove(destinationUser);
                    System.out.println("User " + destinationUser + " has disconnected");
                }
        };
    }
}
