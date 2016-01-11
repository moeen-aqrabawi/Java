/*
 * Exercise 12.1
 * 
 * (NumberFormatException) Listing 7.9, Calculator.java, is a simple command-line calculator. 
 * Note that the program terminates if any operand is non-numeric. 
 * Write a program with an exception handler that deals with non-numeric operands; then write another program 
 * without using an exception handler to achieve the same objective. Your program should display a message 
 * that informs the user of the wrong operand type before exiting.
 * 
 */

public class Exercise12_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check number of strings passed
		    if (args.length != 3) {
		      System.out.println(
		        "Usage: java ExerciseOne operand1 operator operand2");
		      System.exit(0);
		    }
		    
		    int op1 = 0;
		    int op2 = 0;

		    try {
		    op1 = Integer.parseInt(args[0]);
		    op2 = Integer.parseInt(args[2]);
		    }
		     catch (NumberFormatException e){
		    	 System.out.println("One of the operands is not a valid integer");
		    	 System.exit(0);
		    }
		    
		    
		    // The result of the operation
		    int result = 0;
		    
		    // Determine the operator
		    switch (args[1].charAt(0)) {
		      case '+': result = Integer.parseInt(args[0]) +
		                         Integer.parseInt(args[2]);
		                break;
		      case '-': result = Integer.parseInt(args[0]) -
		                         Integer.parseInt(args[2]);
		                break;
		      case '*': result = Integer.parseInt(args[0]) *
		                         Integer.parseInt(args[2]);
		                break;
		      case '/': result = Integer.parseInt(args[0]) /
		                         Integer.parseInt(args[2]);
		    }

		    // Display result
		    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
		      + " = " + result);
		  }
		
}
