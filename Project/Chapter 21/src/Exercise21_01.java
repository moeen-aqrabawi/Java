/*
 * Exercise 21.01 (Perform set operations on hash sets) Create two linked hash sets and fin their union, differences, and intersection.
 * You can clone the sets to preserve the original sets from being changed. 
 */

import java.util.*;

public class Exercise21_01 {

	public static void main(String[] args) {
	
		LinkedHashSet<String> setOne = new LinkedHashSet<>();
		LinkedHashSet<String> setTwo = new LinkedHashSet<>();
		
		setOne.add("George");setOne.add("Jim");setOne.add("John");setOne.add("Blake");setOne.add("Kevin");setOne.add("Michael");
		setTwo.add("George");setTwo.add("Katie");setTwo.add("Kevin");setTwo.add("Michelle");setTwo.add("Ryan");
		
		LinkedHashSet<String> setone = (LinkedHashSet<String>)setOne.clone();
		LinkedHashSet<String> settwo = (LinkedHashSet<String>)setTwo.clone();
		LinkedHashSet<String> union = (LinkedHashSet<String>)setOne.clone();
		LinkedHashSet<String> intersection = (LinkedHashSet<String>)setOne.clone();
		LinkedHashSet<String> difference = (LinkedHashSet<String>)setOne.clone();


		union.addAll(settwo);
		  System.out.printf("Union of two Set %s and %s is %s %n",
	                setone.toString(), settwo.toString(), union.toString());
	        System.out.println("total number of element in union of two Set is : "
	                            + union.size());

	    intersection.retainAll(settwo);	
        System.out.printf("Intersection of two Set %s and %s is %s %n",
                setone.toString(), settwo.toString(), intersection.toString());
        System.out.println("Number of elements common in two Set : "
                           + intersection.size());
        
        difference.removeAll(settwo);	
        System.out.printf("Difference of two Set %s and %s  is %s %n",
                setone.toString(), settwo.toString(), difference.toString());
        System.out.println("Number of elements common in two Set : "
                           + difference.size());
        

	}

}
