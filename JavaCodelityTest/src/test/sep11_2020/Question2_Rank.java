package test.sep11_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2_Rank {
	public static void main(String args[]) 
	{ 
	HashMap<Integer, List<String>> Student = new HashMap<Integer, List<String>>(); 
	List<String> student1 = new ArrayList<String>(); 
	List<String> student2 = new ArrayList<String>(); 
	List<String> student3 = new ArrayList<String>(); 
	List<String> eachValue = new ArrayList<String>(); 
 
	student1.add("Student1"); 
	student1.add("480"); 
	 
	student2.add("Student2"); 
	student2.add("460"); 
	 
	student3.add("Student3"); 
	student3.add("490"); 
	 
	Student.put(1, student1); 
	Student.put(2, student2); 
	Student.put(3, student3); 
	//System.out.println(Student); 
	//String name = ""; 
	//int temp = 0; 
	int total = 0;
	for(Map.Entry m : Student.entrySet()) 
	{ 
		 System.out.println("Student ID: "+m.getKey()+" "+"Student name and Marks: "+m.getValue());
	eachValue = (List<String>) m.getValue(); 
	total = Integer.parseInt(eachValue.get(1)) ; 
	System.out.println("Total marks:"+ total); 
		//if(total > temp) { 
			//temp = total; 
			//name = eachValue.get(0); 
		//} 
	} 
	
	//for (String list: eachValue) {
	//	System.out.println(list);
//	}
	//System.out.println("The Name of The Student is : "+name+" and Marks Highest is : "+total); 
	} 

}
