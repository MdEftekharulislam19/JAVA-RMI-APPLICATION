import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client {
 private Client() {}
 public static void main(String[] args) {
 try {
 // Getting the registry
 Registry registry = LocateRegistry.getRegistry(null);
int a,b;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);

 // Looking up the registry for the remote object
 Hello stub = (Hello) registry.lookup("Hello");
 // Calling the remote method using the obtained object
  stub.sum(a,b);
 // System.out.println("Remote method invoked");
} catch (Exception e) {
 System.err.println("Client exception: " + e.toString());
 e.printStackTrace();
 }
 }
}