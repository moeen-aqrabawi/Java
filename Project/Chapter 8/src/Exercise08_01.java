/*
 Exercise 8.1 (sum elements column by column) Write a method that returns 
 the sum of all the elements in a specified column in a matrex using the following header
 public static double sumColumn(double[][] m, int columnIndex)
 Write a test program that reads a 3-by-4 matrix and displays the sum of each column.  
 */

import java.util.Scanner;


public class Exercise08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					double[][] m = createArray();
					double sum;
					
					for (int i = 0; i<=m.length;i++) {
					sum = sumColumn(m, i); 
					System.out.println("Sum of the elements at column " + i + " is " + sum);
					}
				}

	
				public static double[][] createArray(){	
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in);
					
					double[][] m = new double[3][4];
					System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row: ");
					for (int i = 0; i < m.length; i++)
						for (int j = 0; j < m[0].length; j++)
							m[i][j] = input.nextDouble();
					
					return m;
				}
				
				
				public static double sumColumn(double[][] m, int columnIndex){
					
					double total = 0.0;
					
					for (int i = 0; i < m.length; i++) {
							total += m[i][columnIndex];	
						}
			
				return total;
				}
	
}