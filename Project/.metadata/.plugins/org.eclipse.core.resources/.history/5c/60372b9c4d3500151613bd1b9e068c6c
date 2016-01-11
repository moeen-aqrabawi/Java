/*
 * Exercise 3.24 (Game: picking a card) Write a program that simulates picking a card from a
deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8,
9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of
the card.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// make two arrays 
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		String[] symbol = { "Club", "Diamond", "Hearts", "Spades" };
		
		int Num = (int) (Math.random() * 12);
		int Sym = (int) (Math.random() * 3);
		
		switch (Num) {
		case 0:
		System.out.print("The card you picked is Ace of " + symbol[Sym]);
		break;
		case 10:
		System.out.print("The card you picked is Jack of " + symbol[Sym]);
		break;
		case 11:
		System.out.print("The card you picked is Queen of " + symbol[Sym]);
		break;
		case 12:
		System.out.print("The card you picked is King of " + symbol[Sym]);
		break;
		default:
		System.out.print("The card you picked is " + number[Num] +  " of " + symbol[Sym]);
		break;		
	}
   }
}
