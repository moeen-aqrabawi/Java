
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Exercise 16_01:
 * 		(Use radio button) Write GUI program as shown in Figure 16.36a. You can use buttons to move the message to the left and right
 * and use the radio to change the color of the message displayed.
 */


public class Exercise16_01 extends Application {
	
	public static void main(String[] args) { Application.launch(args); }
 
	
	protected BorderPane getPane() {

		Text text = new Text(60,60, "Programming is fun");
	    text.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));
	    
		HBox Btnpane = new HBox(20);
		Button btnLeft = new Button("<=");
		Button btnRight = new Button("=>");
		Btnpane.getChildren().addAll(btnLeft,btnRight);
		Btnpane.setAlignment(Pos.CENTER);
		Btnpane.setStyle("-fx-border-color: black");
	
		HBox Radiopane = new HBox(20);
		Radiopane.setStyle("-fx-border-color: black");
		RadioButton btnRed = new RadioButton("Red");
		RadioButton btnYellow = new RadioButton("Yellow");
		RadioButton btnBlack = new RadioButton("Black");
		RadioButton btnOrange = new RadioButton("Orange");
		RadioButton btnGreen = new RadioButton("Green");
		Radiopane.getChildren().addAll(btnRed, btnYellow,btnBlack,btnOrange,btnGreen);
		Radiopane.setAlignment(Pos.CENTER);
		
		BorderPane pane = new BorderPane();
	    
	    pane.setBottom(Btnpane);
	    pane.setTop(Radiopane);
	    
	    Pane paneText = new Pane();
	    paneText.getChildren().addAll(text);
	    pane.setCenter(paneText);
	    
	    btnLeft.setOnAction(e -> text.setX(text.getX() -10));
	    btnRight.setOnAction(e -> text.setX(text.getX() + 10));
	    
	    ToggleGroup group = new ToggleGroup();
	    btnRed.setToggleGroup(group);
	    btnYellow.setToggleGroup(group);
	    btnBlack.setToggleGroup(group);
	    btnOrange.setToggleGroup(group);
	    btnGreen.setToggleGroup(group);
	    
	    
	    btnRed.setOnAction(e -> {if(btnRed.isSelected()) text.setFill(Color.RED);});
	    btnYellow.setOnAction(e -> {if(btnYellow.isSelected()) text.setFill(Color.YELLOW);});
	    btnBlack.setOnAction(e -> {if(btnBlack.isSelected()) text.setFill(Color.BLACK);});
	    btnOrange.setOnAction(e -> {if(btnOrange.isSelected()) text.setFill(Color.ORANGE);});
	    btnGreen.setOnAction(e -> {if(btnGreen.isSelected()) text.setFill(Color.GREEN);});

	    
	    
	    return pane;
	}
	
   
	public void start(Stage primaryStage) {
		
		Scene scene = new Scene(getPane(),450,200);
		primaryStage.setTitle("Exercise 16_01");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

}
