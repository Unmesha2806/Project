import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	
	public static void main(String[] args) {
		Hello hello;
		
			try {
				hello = (Hello)Naming.lookup("localhost");
				System.out.println("Client Program...");
				System.out.println("Server " +hello.sayHello());
			} catch (MalformedURLException | RemoteException | NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}


