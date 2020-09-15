//4. Write a java program to store 5 unique elements in sorted order. 
//Error should exist if user tries to add duplicates.


package test.sep11_2020;

import java.util.*; 

public class Q04_TreeSet {
	public static void main(String[] args) 
	 { 
	     TreeSet<String> ts1 = new TreeSet<String>(); 

	     // Elements are added using add() method 
	     ts1.add("Deepika"); 
	     ts1.add("Bala"); 
	     ts1.add("Vishnu"); 
	     ts1.add("Usha");
	     ts1.add("Baby");

	     // Duplicates will not get insert 
	     ts1.add("Baby"); 

	     // Elements get stored in default natural 
	     // Sorting Order(Ascending) 
	     System.out.println(ts1); 
	 } 

}
