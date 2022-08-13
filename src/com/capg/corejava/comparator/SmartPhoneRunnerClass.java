package com.capg.corejava.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class SmartPhoneRunnerClass {

	public static void main(String[] args) {

		List<SmartPhone> phonelist = new ArrayList<>();

		phonelist.add(new SmartPhone(4, "Redmi", 8000));
		phonelist.add(new SmartPhone(6, "Oppo", 10000));
		phonelist.add(new SmartPhone(12, "Samsung", 33000));
		phonelist.add(new SmartPhone(8, "Motorola", 15000));

		// Comparator is an interface so direct object creation is not possible,
		// so we are creating an anonymous class
		//----------------------------------------------------------------------
		Comparator<SmartPhone> comparator = new Comparator<SmartPhone>() {

			@Override
			public int compare(SmartPhone phone1, SmartPhone phone2) {
				if (phone1.getRam() > phone2.getRam())
					return 1; 
				else
					return -1; 
			}
		};

		Collections.sort(phonelist, comparator);

		phonelist.forEach(System.out::println);

	}
}
