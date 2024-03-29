package code;

import java.util.Scanner;
import java.util.Iterator;

import grpc.stub.MessagingServiceGrpc;
import grpc.stub.Subscribers.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class Subscriber {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();    
        MessagingServiceGrpc.MessagingServiceBlockingStub stub = MessagingServiceGrpc.newBlockingStub(channel);
        MessagingServiceGrpc.MessagingServiceStub stubStream = MessagingServiceGrpc.newStub(channel);
        Scanner scanner = new Scanner(System.in);
        String username;
        int responseCode;
        System.out.println("_________________________________________________________");
        System.out.println("");
        System.out.println("\tWelcome to the messaging service");
        System.out.println("_________________________________________________________");
        System.out.print("Choose your nickname");
        do {
            System.out.print(" (it has to be unique): ");
            username = scanner.nextLine();
            try{
            Nickname request = Nickname.newBuilder().setUsername(username).build();
            ServerResponse response = stub.subscription(request);
            responseCode = response.getCode();}
            catch(Exception e){
                System.out.println("Server out of service , try reconnecting later");
                System.exit(0);
                return;
            }
        } while (responseCode != 100);
        System.out.println("these are the messaging service commands\n");
        System.out.println("I- To send a message :");
        System.out.println("Reciever:message");
        System.out.println("II- To display the online users' list :");
        System.out.println("show:online");
        System.out.println("III- To exit the service :");
        System.out.println("service:disconnect");
        System.out.println("_________________________________________________________");

        StreamObserver<content> obs = stubStream.chat(new StreamObserver<content>() {
            @Override
            public void onNext(content value) {
                System.out.printf("<a message sent to you by  %s > %s\n", value.getSource(), value.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error: " + t.getMessage());
                System.out.println("Server encountred an error");
                System.exit(0);
            }

            @Override
            public void onCompleted() {
                System.out.println("Server has closed the connection");
                channel.shutdown();
                System.exit(0);
                
            }
        });
        System.out.println("");
        content message = content.newBuilder().setMessage(username).build();
        obs.onNext(message);
   

        while (true) {

            String command = scanner.nextLine();
            String[] command_args = command.split(":");
            if (command_args.length != 2) {
                System.out.println("Invalid command");
                continue;
            } else if (command_args[0].equals("show") && command_args[1].equals("online")) {
                Empty request = Empty.newBuilder().build();
                Iterator<connectedUser> users = stub.showonline(request);
                connectedUser userTEMP;
                System.out.println("\tOnline users : ");
                while (users.hasNext()) {
                    userTEMP = users.next();
                    System.out.println(userTEMP.getUser());
                }

            } else if (command_args[0].equals("service") && command_args[1].equals("disconnect")) {
                obs.onCompleted();
            } else {
                message = content.newBuilder().setDestination(command_args[0]).setSource(username)
                        .setMessage(command_args[1]).build();
                obs.onNext(message);
            }
        }
    }
}
