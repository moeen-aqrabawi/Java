/* 
 * Exercise 12.1 Without Exception Handler
 */


public class WithoutEH {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// Check number of strings passed
			    if (args.length != 3) {
			      System.out.println(
			        "Usage: java ExerciseOne unmeric1 operator numeric2");
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