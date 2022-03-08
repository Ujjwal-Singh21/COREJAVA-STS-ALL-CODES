package com.capg.corejava.oops;

// ENCAPSULATION
public class Student {

	// ATTRIBUTES/PROPERTIES
	int rollNo;
	String name;
	double height;

	// METHODS/FUNCTIONS
	public void student1(int rollNo1, String name1, double height1) {

		System.out.println(" Hello : my rollno is " + rollNo1 + " my name is " + name1 + " my height is " + height1);
	}

	public void student2(int rollNo2, String name2, double height2) {

		System.out.println(" Hello : my rollno is " + rollNo2 + " my name is " + name2 + " my height is " + height2);
	}

	public static void main(String[] args) {

		Student student = new Student();
		student.student1(1001, "Ujjwal", 5.7);
		student.student2(1002, "Rajesh", 6.6);

	}

}
