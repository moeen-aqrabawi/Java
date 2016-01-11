/*

(Display images) Write a program that displays four images in a grid pane, as
shown in figure 14.43a 
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Exercise14_01 extends Application {

 @Override
 public void start(Stage primaryStage) {
  GridPane pane = new GridPane();
  
  pane.setHgap(5);
  pane.setVgap(5);
  pane.setAlignment(Pos.TOP_LEFT);
  
  Image img1 = new Image("image/uk.gif");
  Image img2 = new Image("image/china.gif");
  Image img3 = new Image("image/ca.gif");
  Image img4 = new Image("image/us.gif");
    
  ImageView imgView1 = new ImageView(img1);
  ImageView imgView2 = new ImageView(img2);
  ImageView imgView3 = new ImageView(img3);
  ImageView imgView4 = new ImageView(img4);
  
  pane.add(imgView1, 0, 0);
  pane.add(imgView2, 0, 1);
  pane.add(imgView3, 1, 0);
  pane.add(imgView4, 1, 1);
  
  
 
  
  Scene scene = new Scene(pane);
  primaryStage.setTitle("Exercise14_01");
  primaryStage.setScene(scene);
  primaryStage.show();
 }


 public static void main(String[] args) {
  launch(args);
 }
}