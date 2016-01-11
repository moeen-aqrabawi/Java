
 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Exercise31_01Server  {
   
	private static ServerSocket server;
	  
	public static void main (String[] args) throws IOException, ClassNotFoundException {

		   server = new ServerSocket(8010);
		   
		   System.out.println("Waiting for client request");
		   Object s = new Loan();
		      
		  while(true){
	            //creating socket and waiting for client connection
	            Socket socket = server.accept();
	            //read from socket to ObjectInputStream object
	            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
	            //convert ObjectInputStream object to String
	            s = (Loan) ois.readObject();
	    		System.out.println("Recieved from Client : Intrest Rate" + ((Loan) s).getAnnualInterestRate() + " Years " + ((Loan) s).getNumberOfYears() + " Amount " + ((Loan) s).getLoanAmount()) ;
	    	  //create ObjectOutputStream object
	            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
	            //write object to Socket
	            //oos.writeObject(s);
	            //close resources
	            ois.close();
	            oos.close();
	            socket.close();
	            if(((Loan) s).getNumberOfYears() == 9999) break;
		       }
	            System.out.println("Shutting down Socket server!!");
	            //close the ServerSocket object
	            server.close();
		  }
	
}
