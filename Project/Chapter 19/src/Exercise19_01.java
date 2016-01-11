/*
 *  Exercise 19.1 (Revision Listing 19.1) Revise the GenericStack class in Listing 19.1 to implement it using array rather than
 *  ArrayList. You should check the array size before adding a new element to the stack. If the array is full, create a new array that 
 *  doubles the current array size and copy elements fin the current array to the new array.
 *  
 */


public class Exercise19_01 {

	public static void main(String[] args) {
 
		 StackInterface<Integer> stack = new ArrayStack<Integer>();
		      //test empty   
		         System.out.println(stack.empty());
		       //make Stack of Integers
		       //test push, peek, pop
		       //MAX number of integers on stack
		         final Integer MAX = new Integer(100);
		         System.out.println("push on stack");
		         for(Integer i = 1; i <= MAX; i++){
		            stack.push(i);
		            System.out.println(stack.peek());
		         }
		         System.out.println(stack.empty());
		         System.out.println("pop off stack");
		         for(Integer i = 1; i <= MAX; i++){
		            Integer x = stack.pop();
		            System.out.println(x);
		         }		    
		      //test exceptions
		         try{
		            stack.pop();
		         }	
		             catch(Exception exception){
		               System.out.println(exception);
		            }
		         try{
		            stack.peek();
		         }	
		             catch(Exception exception){
		               System.out.println(exception);
		            }        
		            
		      //make an Stack of Strings
		         StackInterface<String> stack2 
		         = new ArrayStack<String>();
		         stack2.push("A");
		         stack2.push("B");
		         stack2.push("C");
		         stack2.push("D");
		         System.out.println("Top of stack is: " + stack2.peek());
		         String letter = stack2.pop();
		         System.out.println("Pop off element: " + letter);
		         letter = stack2.pop();
		         System.out.println("Pop off element: " + letter);
		         letter = stack2.pop();
		         System.out.println("Pop off element: " + letter);
		         stack2.push("E");
		         stack2.push("F");
		         System.out.println("Top of stack is: " + stack2.peek());
		         System.out.println();
		      	
		      //make an Stack of ThreeNames
		         StackInterface<ThreeNames> stack3 = new ArrayStack<ThreeNames>();
		         ThreeNames name = new ThreeNames("A", "B", "C");
		         stack3.push(name);
		         name = new ThreeNames("X", "Y", "Z");
		         stack3.push(name);
		         System.out.println("Top of stack is: " + stack3.peek());
		         System.out.print("Pop off elements: ");
		         for(int i=0;i<2;i++){
		            System.out.print(stack3.pop() + "; ");
		         }
		         System.out.println();					
		      }//end of main
		   	 
		   }//end class

		
		
		
	}

}
