/*
 Exercise 6.2 (Sum the digits in an integer) write a method that computes the sum of the digits 
 in an integer. Use the following method header public static int sumDigits(long n).
 */

import java.util.Scanner;


public class Exercise06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		System.out.print("Enter Integer Number: ");
		
		Scanner input = new Scanner (System.in); 
		i = input.nextInt();
		
		System.out.println("The sum of the digits is : " + sumDigits(i));
		
	}
		
		public static int sumDigits(long n) {
			  int sum = 0;
			  
			  
			  String Str = Long.toString(n);
			  int len = Str.length();
			  
			  for (int i = 0; i < len; i++) {
			     sum += Character.getNumericValue(Str.charAt(i));
			    }
			  return sum;
			}
		
	}


