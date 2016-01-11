/* 
 * Exercise 20.1
 * (Display words in ascending alphabetical order)
 * Write a program that reads words from a text file and displays the words  (duplicates allowed) in ascending alphabetical order.
 * The words must start with a letter. The text file is passed as a command-line argument.	
 */


import java.io.*;
import java.util.*;


public class Exercise20_01 {

	public static void main(String[] args) throws IOException {
			
		    String fn=null;
		    //Scanner sfn = new Scanner(System.in);
			//System.out.print("Enter file name : ");
			//fn = sfn.next();
		    
	        if (args.length == 0) { System.out.println("\n\nUsage: Exercise20_01 filename \nI will use the defult file 'words.txt'\n"); fn = "words.txt";}
	        else fn=args[1];
	        
		    File file = new File(fn);
			
			if (file.exists())
			{
			
			Scanner scanner = new Scanner(file);
			ArrayList<String> list = new ArrayList<String>();
			System.out.print("Words in file words.txt : ");
			
			try {
				while(scanner.hasNext()) {
					String name = scanner.next();
					System.out.print(name);
					list.add(name);   	
			     }
				}
			finally {scanner.close();}
			
		    System.out.print("\nWords in ascending order : ");
			Collections.sort(list);
			System.out.print(list.toString());

		  }
			else
			{ System.out.println("File does not exisits !!?");
     	}
	}
}
