
import java.io.BufferedReader;

public class ReceiveThread extends Thread {
    private BufferedReader input;
    ReceiveThread(BufferedReader input){
        super();
        this.input = input;
    }
    public void run(){
        try{
            while (true) System.out.println(input.readLine());
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
