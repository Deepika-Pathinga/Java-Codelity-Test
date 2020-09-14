package theory.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("seetha");
		names.add("sudhin");
		names.add("Swetha");
		names.add("Neethu");
		names.add("ananya");
		names.add("Athira");
		names.add("bala");
		names.add("Tony");
		names.add("Karthika");
		names.add("Nithin");
		names.add("Vinod");
		names.add("jeena");
		//Collections.sort(names);
		
		//option1:
		names.sort(String::compareToIgnoreCase);
		
		//option2:
	/*	Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.compareToIgnoreCase(s2);
		    }
		});*/
		for(int i=0; i<names.size(); i++)
		    System.out.println(names.get(i));

		
	}
	
	
}
