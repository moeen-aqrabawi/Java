

/*
 * Exercise 13.1 (Triangle class) Design a new Triangle class that extends the abstract
GeometricObject class. Draw the UML diagram for the classes Triangle
and GeometricObject and then implement the Triangle class. Write a test
program that prompts the user to enter three sides of the triangle, a color, and a
Boolean value to indicate whether the triangle is filled. The program should create
a Triangle object with these sides and set the color and filled properties using
the input. The program should display the area, perimeter, color, and true or false
to indicate whether it is filled or not.

 */

import java.util.Scanner;

public class Exercise13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        @SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);

		        System.out.println("Enter three sides of the Triangle");
		        double side1 = input.nextDouble();
		        double side2 = input.nextDouble();
		        double side3 = input.nextDouble();

		        Triangle T = new Triangle(side1, side2, side3);
		        
		        System.out.println("Enter the color of the Triangle");
		        String color = input.next();
		        T.setColor(color);
		     
		        System.out.println(" Is the Triangle filled? Enter 1-'True' or any otherwise");
		        int isfilled = input.nextInt(); 
		        
		        if (isfilled == 1) T.setFilled(true);
		            else T.setFilled(false);
		        
		        System.out.println("The Triangle Sides are \n side 1: " + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
		        System.out.println("The Triangle's Area is " + T.getArea());
		        System.out.println("The Triangle's Perimeter is "
		                           + (side1 + side2 + side3));
		        System.out.println("The Triangle's Color is " + T.getColor() );
		        System.out.println("This Triabgle filled status is " + T.isFilled());

		
	}

}
