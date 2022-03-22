package com.capg.corejava.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class EmployeeRunnerClass {

	public static void main(String[] args) {

		// If treeset is used, then it automatically sorts objects based on natural order
		// Hence Collections.sort(employee) is not required
		// TreeSet<Employee> employee = new TreeSet<>();

		List<Employee> employee = new LinkedList<>();

		employee.add(new Employee(1005, "ArRahman", 88000));
		employee.add(new Employee(1003, "Jatin", 55000));
		employee.add(new Employee(1002, "Shravan", 50000));
		employee.add(new Employee(1001, "Nadeem", 95000));
		employee.add(new Employee(1004, "Lalit", 60000));

		Collections.sort(employee);

		// System.out.println(employee);

		for (Employee e : employee) {
			System.out.println(e);
		}
	}

}
