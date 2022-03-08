package com.capg.corejava.constructors;

public class Employee2 {

	int eid;
	String ename;
	double sal;

	Employee2() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}

	Employee2(int eid1, String ename1, double sal1) {
		this.eid = eid1;
		this.ename = ename1;
		this.sal = sal1;
	}

	public void display() {

		System.out.println("Display method of class Employee");
		System.out.println("Employee Id: " + eid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + sal);

	}

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.display();

		Employee2 e2 = new Employee2(1001, "Ujjwal", 55000);
		e2.display();

	}

}
