/*
 * Exercise 3.14 (Game: head or tail) Write a program that lets the user guess the head or tail of
a coin. The program randomly generates an integer 0 or 1, which represents head or tail. 
The program prompts the user to enter a guess and reports whether
the guess is correct or incorrect.

*/

import java.util.Random;
import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create input method
		Scanner input = new Scanner(System.in);
		// generate random number 0 or 1
		double randomNumber = Math.random();
		int randomGuess = (randomNumber < 0.5) ? 0 : 1;
		// get input o for head 1 for tail
		System.out.print("Please guess 0-head 1-tail :");
		int userGuess = input.nextInt();
		// compare value
		if (userGuess == randomGuess) {
		System.out.println("Congratulations! your guess is right");
		} else {
		System.out.println("Sorry, try again! you guess is wrong");
		}
	}
}
