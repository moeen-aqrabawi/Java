
/*
 * Exercise 15.4 (Create a simple calculator) Write a program to perform addition, subtraction, multiplication, and division, 
 * as shown in Figure 15.25a.  
 */


	import javafx.application.Application;
    import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	import javafx.stage.Stage;
	import javafx.stage.StageStyle;
	
public class Exercise15_04 extends Application {
	
	public static void main(String[] args) { Application.launch(args); }

	    TextField tfnum1 = new TextField("0");
	    TextField tfnum2 = new TextField("0");
	    TextField tfresult = new TextField("0");
	  
	 public void start(Stage stage) {
	      
		    GridPane gridPane = new GridPane();
		    Button addB = new Button("  Add  ");
		    Button mulB = new Button("Multiply");
		    Button subB = new Button("Subtract");
		    Button divB = new Button("Divide");
		    
		     gridPane.add(new Label("Number1: "),0,0);gridPane.add(tfnum1,1,0);
			 gridPane.add(new Label("Number2: "),2,0);gridPane.add(tfnum2,3,0);
			 gridPane.add(new Label("Result: "),4,0); gridPane.add(tfresult,5,0);
			 
			 gridPane.add(addB,0,1);gridPane.add(subB,1,1);gridPane.add(mulB,2,1);gridPane.add(divB,3,1);
			 
			 gridPane.setAlignment(Pos.CENTER);
			 gridPane.setGridLinesVisible(false);
			 gridPane.getColumnConstraints().add(new ColumnConstraints(65));
			 gridPane.getColumnConstraints().add(new ColumnConstraints(75));
			 gridPane.getColumnConstraints().add(new ColumnConstraints(75));
			 gridPane.getColumnConstraints().add(new ColumnConstraints(75));
			 gridPane.getColumnConstraints().add(new ColumnConstraints(75));
			 gridPane.getColumnConstraints().add(new ColumnConstraints(85));

			 addB.setOnAction(e -> calc("Add"));
			 subB.setOnAction(e -> calc("Sub"));
			 divB.setOnAction(e -> calc("Div"));
			 mulB.setOnAction(e -> calc("Mul"));
			 
			 Scene scene = new Scene(gridPane,460,100);
			 stage.setTitle("Exercise15_04");
		     stage.initStyle(StageStyle.UTILITY);
		     stage.setResizable(false);
		     stage.setScene(scene);
		     stage.show();
	  }
	

     private void calc(String s) {
	 
	 double n1 = Double.parseDouble(tfnum1.getText());
	 double n2 = Double.parseDouble(tfnum2.getText());
	 Double r= new Double(0);
	 
	    switch (s) {
	      case "Add": r=n1+n2; tfresult.setText(r.toString()); break;
	      case "Sub": r=n1-n2; tfresult.setText(r.toString()); break;
	      case "Mul": r=n1*n2; tfresult.setText(r.toString());break;
	      case "Div": if (n2 !=0) r=n1/n2; tfresult.setText(r.toString()); break;
	              }
	  }
}
	  