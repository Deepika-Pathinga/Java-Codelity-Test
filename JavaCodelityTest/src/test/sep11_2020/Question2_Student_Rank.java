/*
 * 2. Write a java program to store 5 student information and award the students 
 * with 1st rank, 2nd rank and 3rd rank according to marks obtained where each 
 * student has student name, student marks and student reg no information
 * 
 */

package test.sep11_2020;

import java.util.ArrayList;
import java.util.Iterator;

public class Question2_Student_Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Question2_Student> students = new ArrayList<>();
        
        students.add(new Question2_Student(1, "Student1", (long) 400));
        students.add(new Question2_Student(2, "Student2", (long) 420));
        students.add(new Question2_Student(3, "Student3", (long) 410));
        students.sort(new Question2_Rank1());
        
       // System.out.println(students);
     //  Iterator it = students.iterator();
    //   while(it.hasNext()) {
    //	   System.out.println(it.next());
     //  }
       int rank;
       for(int i=0;i<students.size();i++) {
    	   rank=i+1;
    	   System.out.println("Rank "+rank+" "+students.get(i));
       }
        

	}

}
