/*
 * 8. Store user defined employee objects into arraylist and 
 * Remove duplicates from arraylist without using collections.
 */

package test.sep11_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q08_EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q08_Employee hr = new Q08_Employee(1, "HR");
		Q08_Employee hrDuplicate = new Q08_Employee(1, "HR");       // Duplicate Object
		Q08_Employee teamLeader = new Q08_Employee(2, "Team Leader");
		List<Q08_Employee> list=new ArrayList<>();
		list.add(hr);
		list.add(hrDuplicate);
		list.add(teamLeader);

		System.out.println("Employee List(Duplicate)");
		for (Q08_Employee employee : list) {
		    System.out.println(employee.getEmployeeName());
		}
		List<Q08_Employee> uniqueEmployee = list.stream()
		                                              .distinct()               // it will remove duplicate object, It will check duplicate using equals method
		                                              .collect(Collectors.toList());
		System.out.println("Employee List(Unique)");
		for (Q08_Employee employee : uniqueEmployee) {
		    System.out.println(employee.getEmployeeName());
		}

	}

}


