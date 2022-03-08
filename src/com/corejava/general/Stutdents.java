package com.corejava.general;

import java.util.ArrayList;
import java.util.List;

public class Stutdents {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 55));
		list.add(new Student(2, 54));
		list.add(new Student(3, 87));
		list.add(new Student(4, 67));

		for (Student s : list)
			System.out.println(s);

	}

}

class Student {
	int rollno;
	int marks;

	public Student(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}

}
