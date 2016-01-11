import java.math.BigInteger;
import java.util.Scanner;

/* 
 * Exercise 18.1
 * (Factorial) Using the BigInteger class introduced in Section 10.9, you can find the factorial for a large number (e.g 100!).
 * Implement the factorial method using recursion. Write a program that prompts the se to enter an integer and display its factorial
 */

public class Exercise18_01 {

	   public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       BigInteger n = input.nextBigInteger();
	       BigInteger fact = factorial(n);
	       System.out.println("The Factorial of " + n + " is : " + fact);
	   }

	   public static BigInteger factorial(BigInteger number) {
	        if(number.compareTo(BigInteger.ONE)<=0)//Test Base Case
	            return BigInteger.ONE;//if base case is 0! = 1 or 1! =1
	        else //do recursive step
	            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
	    }
	}