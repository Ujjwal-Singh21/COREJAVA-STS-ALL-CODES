package com.capg.corejava.javatechie.comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// COMPARATOR EXAMPLE 2 BY JAVA TECHIE BY IMPLEMENTING COMPARATOR INTERFACE LIKE comparable.
public class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		
		Student s1 = new Student(3, "Basant");
		Student s2 = new Student(109, "Santosh");
		Student s3 = new Student(105, "Prakash");
		Student s4 = new Student(98, "Ashik");
		Student s5 = new Student(101, "Bikash");
		Student s6 = new Student(3, "Basant2");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);

		// CREATING COMPARATOR OBJECT HERE INSTEAD OF RUNNER CLASS
		//Collections.sort(students, new IdComparator()); 
		Collections.sort(students, new NameComparator());

		for (Student s : students) {
			System.out.println(s);
		}

	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

}