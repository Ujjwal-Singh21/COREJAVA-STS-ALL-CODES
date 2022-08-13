package com.capg.corejava.javatechie.comparator2;
import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// if two ids are equal then sort by names
		if (s1.getId() == s2.getId())
			return s1.getName().compareTo(s2.getName());
		else
			return s1.getId() - s2.getId();
	}
}