
/*
 * Exercise 17.01 (Create a text fiel) Write a program to create a file named Exercise17_01.txt if it does exist.
 * Append new data to it if it already exists. Write 100 integers created randomly into the file using text I/O. 
 * Integers are separated by space.
 * 
 */

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Random;


public class Exercise17_01 {

	public static void main(String[] args) throws IOException {

				File file = new File("Exercise17_01.txt");
				int n = 100; int l = 0;
				
			    if (!file.exists()) {
			    	System.out.println("New file : " + file);
			    	   try {
					        DataOutputStream fout = new DataOutputStream( new FileOutputStream(file));
							Random random = new Random();

				            while (n > 0) {
				                // Randomize an integer and write it to the output file
				                l = random.nextInt(100);
				                fout.writeUTF(l + " ");
				                System.out.print(l + " ");
				                n--;
				            }
				            // Close the stream
				            fout.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				            System.exit(0);
				        }
				}
	else
	{			    	
		System.out.println("Append File :" + file);
	   	RandomAccessFile inout = new RandomAccessFile(file, "rw");

		try {
		    while (true)
		    	 System.out.print(inout.readUTF());
		    
		}
		catch (EOFException ex) {
			System.out.println("\nEOF");
	            n=100;
				Random random = new Random();
				while (n > 0) {
	                // Randomize an integer and write it to the output file
	                l = random.nextInt(100);
	                inout.writeUTF(l + " ");
	                n--;
	            }
	            // Close the stream
	            inout.close();
		}
		
		
	}
}
}

