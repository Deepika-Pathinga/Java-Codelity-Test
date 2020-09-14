/*
 * 8. Store user defined employee objects into arraylist and 
 * Remove duplicates from arraylist without using collections.
 */

package test.sep11_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question8_EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question8_Employee hr = new Question8_Employee(1, "HR");
		Question8_Employee hrDuplicate = new Question8_Employee(1, "HR");       // Duplicate Object
		Question8_Employee teamLeader = new Question8_Employee(2, "Team Leader");
		List<Question8_Employee> list=new ArrayList<>();
		list.add(hr);
		list.add(hrDuplicate);
		list.add(teamLeader);

		System.out.println("Employee List(Duplicate)");
		for (Question8_Employee employee : list) {
		    System.out.println(employee.getEmployeeName());
		}
		List<Question8_Employee> uniqueEmployee = list.stream()
		                                              .distinct()               // it will remove duplicate object, It will check duplicate using equals method
		                                              .collect(Collectors.toList());
		System.out.println("Employee List(Unique)");
		for (Question8_Employee employee : uniqueEmployee) {
		    System.out.println(employee.getEmployeeName());
		}

	}

}


