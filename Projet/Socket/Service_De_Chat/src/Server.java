
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    static List <Socket> clients = new ArrayList<Socket>();
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        try {
            server = new ServerSocket(22000);
            System.out.println("Server is running on port 22000");
            while (true) {
                Socket client = server.accept();
                System.out.println("New client connected: " + client.getInetAddress().getHostAddress());
                clients.add(client);
                ClientThread clientThread = new ClientThread(client);
                clientThread.start();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            if (server != null) {
                server.close();
            }
        }
    }
}
