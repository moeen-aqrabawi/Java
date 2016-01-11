/*

Exercise 10.7 (Game: ATM machine) Use the Account class created in Programming Exercise 
8.7 to simulate an ATM machine. Create ten accounts in an array with id 0, 1, . . . , 
9, and initial balance $100. The system prompts the user to enter an id. If the id is 
entered incorrectly, ask the user to enter a correct id. Once an id is accepted, the 
main menu is displayed as shown in the sample run. You can enter a choice 1 for 
viewing the current balance, 2 for withdrawing money, 3 for depositing money, 
and 4 for exiting the main menu. Once you exit, the system will prompt for an id 
again. Thus, once the system starts, it will not stop.

*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise10_07 {

	   public static void main(String[] args)
	   {
		   //Create 10 test accounts
		   
	       Account[] account = new Account[10];
	       
	       for(int i = 0 ; i < account.length ; i++)
	        {
	    	   account[i] = new Account(i,100, 0); 
	        }
	        menu(account);
	   }
	     
	    
	   @SuppressWarnings("resource")
	static void menu(Account[] account)
	   {
	       int i;
	       int id;// the id enter from Input
	       double withdraw1;// user input how much want to withdraw from account
	       double deposite1;// user input how much want to deposit to acc
	    System.out.println("Enter an id:");
			Scanner input1 = new Scanner(System.in);
	        id = input1.nextInt();
	       for(int j = 0 ; j < account.length ; j++)
	    {
	        if(id == account[j].getId() && j < account.length)
	        {
	       do{
	           System.out.println("Main menu:");
	           System.out.println("1: check balance");
	           System.out.println("2: withdraw");
	           System.out.println("3: deposit");
	           System.out.println("4: exit");
	           System.out.println("Enter a choice:");
	          Scanner input = new Scanner(System.in);
	          i = input.nextInt();
	    switch(i)
	       {
	        case 1: System.out.println("  Your balance is : " + account[j].getBalance());
	                    break;
	                      
	        case 2: System.out.println("How much do you want to withdraw?");
	                   withdraw1 = input1.nextDouble();
	                   account[j].withdraw(withdraw1);
	                 break;
	        case 3: System.out.println("How much do you want to deposit?");
	                   deposite1 = input.nextDouble();
	                   account[j].deposite(deposite1);
	                   break;
	        case 4: break;
	       }
	       }while(i != 4);
	        }
	        else if( j == account.length-1)
	        {
	            System.out.println("Wrong ID");
	            System.out.println("Enter an new id:");
	            id = input1.nextInt();
	            j=0;
	        }
	       }       
	   }         
	}
	
	
