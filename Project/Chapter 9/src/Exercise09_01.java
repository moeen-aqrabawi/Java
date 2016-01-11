/*
 *  
Exercise 9.1 : (The Rectangle Class) Following the example of the Circle class in Section 9.2
design a class named Rectangle to represent rectangle. The class contains:
- Two double data fields named width and height that specify the width and height of the rectangle. the default values are 1 for both.
- A no-arg constructor that creates a default rectangle 
- A constructor that creates a rectangle with the specified width and height
- A method named getArea() that returns the area of this rectangle
 - A method named getPerimeter() that returns perimeter
 
Write a test program that creates two Rectangle objects - one with width 4 and height 40  
and the other with width 3.5 and height 35.9. Display the width and height, area and permiter of each rectangle in this order.  
 
 */



public class Exercise09_01 {

	public static void main(String[] args) {

		double w1 = 4; double h1 = 40;
		double w2 = 3.5; double h2 = 35.9;
		
		Rectangle rectangle1 = new Rectangle(w1,h1);
		Rectangle rectangle2 = new Rectangle(w2,h2);
		
		System.out.println("Rectangle 1st width is " + w1 + " height is " + h1 + " Area is " + rectangle1.getArea() + " Permiter is " + rectangle1.getPerimeter());
		System.out.println("Rectangle 2nd width is " + w2 + " height is " + h2 + " Area is  " + rectangle2.getArea() + " Permiter is " + rectangle2.getPerimeter());
		
	}

}
