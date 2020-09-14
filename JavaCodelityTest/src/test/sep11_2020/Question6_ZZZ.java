/*
 * 6. Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position.delete N charactors from 6th position from vectorExample:if user input =5
 * Then vector stores="tekZZZZZarch"
 * Delete 5 character from 6th position so final string="tekZZZh"
 */

package test.sep11_2020;

import java.util.Scanner;
import java.util.Vector;

public class Question6_ZZZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str =sc.next();
		System.out.println("Enter a integer value");
		int n=sc.nextInt();
		sc.close();
		
		String ZZZ= str.join("z", str);
		System.out.println(ZZZ);
		Vector<String> vec = new Vector<String>();
	      vec.addElement(ZZZ);
	     // vec.setElementAt(str, n);
	     // vec.set(0, str);
		
	}

}
