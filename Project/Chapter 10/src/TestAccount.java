/* 
 * Only to test the accounts
 * 
 */

import javax.swing.JOptionPane;

public class TestAccount {
   public static void main(String[] args) {
   	    
      Account account = new Account(1, 100, 55.4);
   	
      account.withdraw(0);
      account.deposite(0);
      account.setTotal(0);
      account.setMonthly(0);
      	       
      JOptionPane.showMessageDialog(null, account.toString());
         
      JOptionPane.showMessageDialog(null, "Good Buy");    
   }  
}

