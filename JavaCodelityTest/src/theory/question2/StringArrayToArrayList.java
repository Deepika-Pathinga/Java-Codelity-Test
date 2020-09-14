package theory.question2;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /* Array Declaration and initialization*/
		  String countrynames[]={"USA", "India", "China", "Japan"};

		  /*Array to ArrayList conversion*/
		  ArrayList<String> countrylist= new ArrayList<String>(Arrays.asList(countrynames));

		  /*Adding new elements to the converted List*/
		  countrylist.add("Russia");
		  countrylist.add("Canada");

		  /*Final ArrayList content display using for*/
		  for (String str: countrylist)
		  {
			System.out.println(str);
	       	  }

	}

}
