/* 
 * Exercise 5.17 (Display pyramid) Write a program that prompts the use to enter an integer from 
  1 to 15 and display a pyramid, as shown in the sample figure
 */

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get the number
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines:");
		int lines = input.nextInt();
		
		if (lines >=1 && lines <=15) {
		//Loop for number of Lines
        for (int i = 1; i <= lines; i++) {
            // Loop for spacing
            for (int j = 1; j <= lines - i; j++){
            	System.out.print("   ");            
            	}          
            // left half of the pyramid             
            for (int k = i; k >= 1; k--){
                System.out.print((k > 15) ? +k : "  " + k);
            }
            // corresponding right half of the pyramid
            for (int k = 2; k <= i; k++) {               
            	System.out.print((k > 15) ? +k : "  " + k);
            }
            // next line
            System.out.println();
        } 
		} else {
            	System.out.println("Number of lines should be between [1 - 15]");
            }
	}
		
}
