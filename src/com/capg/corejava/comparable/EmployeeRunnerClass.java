package com.capg.corejava.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRunnerClass {

	public static void main(String[] args) {

		List<Employee> employee = new LinkedList<>();
		
		employee.add(new Employee(1002, "Shravan", 50000));
		employee.add(new Employee(1001, "Nadeem", 95000));
		employee.add(new Employee(1004, "Lalit", 60000));
		employee.add(new Employee(1003, "Jatin", 55000));

		Collections.sort(employee);

		// System.out.println(employee);

		for (Employee e : employee) {
			System.out.println(e);
		}
	}

}
