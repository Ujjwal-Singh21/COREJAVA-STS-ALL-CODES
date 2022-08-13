package com.capg.corejava.comparable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRunnerClass {

	public static void main(String[] args) {

		// If treeset is used, then it automatically sorts objects based on natural order
		// Hence Collections.sort(employee) is not required
		//-------------------------------------------------------------------------------
		
//		 TreeSet<Employee> employeeList = new TreeSet<>();
		
		List<Employee> employeeList = new LinkedList<Employee>();

		employeeList.add(new Employee(1005, "ArRahman", 88000));
		employeeList.add(new Employee(1003, "Jatin", 55000));
		employeeList.add(new Employee(1002, "Shravan", 50000));
		employeeList.add(new Employee(1001, "Nadeem", 95000));
		employeeList.add(new Employee(1004, "Lalit", 60000));

		Collections.sort(employeeList);

		// System.out.println(employee);

		for (Employee e : employeeList) {
			System.out.println(e);
		}
	}
}
