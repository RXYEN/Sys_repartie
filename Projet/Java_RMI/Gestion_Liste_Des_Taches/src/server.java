import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
    public static void main(String[] args) {
        try{
            Impl_List list = new Impl_List();
            Registry registry = LocateRegistry.createRegistry(1234);
            registry.rebind("List", list);
            System.out.println("Server is running ...");
        }
        catch(Exception e){
            System.out.println("Server Error: " + e);
        }
    }
    
}


