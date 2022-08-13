package com.capg.corejava.javatechie.comparator2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// COMPARATOR EXAMPLE 2 BY JAVA TECHIE BY IMPLEMENTING Comparator(I) like Comparable(I)
//-------------------------------------------------------------------------------------
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
	
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	public static void main(String[] args) {

		List<Student> studentsList = new ArrayList<>();
		
		Student s1 = new Student(3, "Basant");
		Student s2 = new Student(109, "Santosh");
		Student s3 = new Student(105, "Prakash");
		Student s4 = new Student(98, "Ashik");
		Student s5 = new Student(101, "Bikash");
		Student s6 = new Student(3, "Basant2");
		
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		studentsList.add(s6);

		// CREATING COMPARATOR OBJECT HERE INSTEAD OF RUNNER CLASS
		//---------------------------------------------------------
//		Collections.sort(students, new IdComparator()); 
		
		Collections.sort(studentsList, new NameComparator());

		for (Student s : studentsList) {
			System.out.println(s);
		}
	}
}