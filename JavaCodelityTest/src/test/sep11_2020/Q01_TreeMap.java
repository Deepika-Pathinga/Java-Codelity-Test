/*
 * 1. Write a java program to store 5 student information in a treeMapNote: 
 * student object has student name and student reg no
 */

package test.sep11_2020;


import java.util.Map;
import java.util.TreeMap;

public class Q01_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> student = 
	             new TreeMap<Integer, String>();
		
		student.put(1, "Vishnu");
		student.put(3, "Bala");
		student.put(2, "Deepika");
		student.put(5, "Baby");			
		student.put(4, "Usha");
		
		System.out.println(student);
		
		System.out.println();			
		
		 for(Map.Entry m: student.entrySet()){    
		      System.out.println(m.getKey()+" "+m.getValue());  
		 }
		
		
	}

}
