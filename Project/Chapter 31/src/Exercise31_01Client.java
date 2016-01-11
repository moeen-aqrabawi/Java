
import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise31_01Client extends Application {
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	private Button btCalculate = new Button("Calculate");

    // Host name or ip
	String host = "localhost";

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
		gridPane.add(tfAnnualInterestRate, 1, 0);
		gridPane.add(new Label("Number of Years:"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("Loan Amount:"), 0, 2);
		gridPane.add(tfLoanAmount, 1, 2);
		gridPane.add(new Label("Monthly Payment:"), 0, 3);
		gridPane.add(tfMonthlyPayment, 1, 3);
		gridPane.add(new Label("Total Payment:"), 0, 4);
		gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(btCalculate, 1, 5);

		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Process events
		btCalculate.setOnAction(new ButtonListener());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("LoanCalculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
	
	
	/** Handle button action */
	private class ButtonListener implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		try {
			  //get the localhost IP address, if server is running on some other IP, you need to use that
	        InetAddress host = InetAddress.getLocalHost();
	        Socket socket = null;
	        ObjectOutputStream oos = null;
	        ObjectInputStream ois = null;
	     
	        socket = new Socket(host.getHostName(), 8010);
	        Loan s = new Loan();
			
			// Get text field
			s.setAnnualInterestRate(tfAnnualInterestRate.getText().trim());
			s.setNumberOfYears(tfNumberOfYears.getText().trim());
			s.setLoanAmount(tfLoanAmount.getText().trim());

			// Write to Server
	        oos = new ObjectOutputStream(socket.getOutputStream());
	        oos.writeObject(s);
	        
	        try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        
	        //ois = new ObjectInputStream(socket.getInputStream());
	       // s = (Loan) ois.readObject();
	        //close resources
	        //  ois.close();
	          oos.close();
	   
		    System.out.println("Recieved from Server : Intrest Rate" + s.getAnnualInterestRate() + " Years " + s.getNumberOfYears() + " Amount " + s.getLoanAmount()) ;
		
		} catch (IOException ex) {
		ex.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
	launch(args);
	}
}
