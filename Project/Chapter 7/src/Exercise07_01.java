/*
 Exercise 7.1 (Assign grades) Write a program that reads student scores, gets the best score,
 and then assigns grades based on the following scheme:
 Grade is A if score is >= best - 10
 Grade is B if score is >= best - 20
 Grade is C if score is >= best - 30
 Grade is D if score is >= best - 40
 Grade is F otherwise
 
 */

import java.util.Scanner;

public class Exercise07_01 {

	/** Main method */
    public static void main(String[] args) {
// Create a Scanner
    Scanner input = new Scanner(System.in);
   
// Get number of students
    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();

    int[] scores = new int[numberOfStudents]; // Array scores
    int best = 0; // The best score
    char grade; // The grade

// Read scores and find the best score
    System.out.print("Enter " + numberOfStudents + " scores: ");
    for (int i = 0; i < scores.length; i++) {
      scores[i]= input.nextInt();
      if ( scores[i] > best)
             best = scores[i];
        }
    
    // Declare and initialize output string
    String output = "";
    
// Assign and display grades
    for (int i = 0; i < scores.length; i++) {
        if (scores[i] >= best - 10)
            grade = 'A';
        else if (scores[i] >= best - 20)
            grade = 'B';
        else if (scores[i] >= best - 30)
            grade = 'C';
        else if (scores[i] >= best - 40)
            grade = 'D';
        else
            grade = 'F';

output += "Student " + i + " score is " +
 scores[i] + " and grade is " + grade + "\n";
}

// Display the result
 System.out.println(output);
}
}
