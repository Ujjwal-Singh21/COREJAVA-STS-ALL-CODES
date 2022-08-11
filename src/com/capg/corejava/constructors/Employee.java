package com.capg.corejava.constructors;

public class Employee {

	Employee() {
		System.out.println("DEFAULT CONSTRUCTOR EXECUTED");
	}

	public void display() {
		System.out.println("Display method of class Employee");

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
	}

}
