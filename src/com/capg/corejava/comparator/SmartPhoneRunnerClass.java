package com.capg.corejava.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class SmartPhoneRunnerClass {

	public static void main(String[] args) {

		List<SmartPhone> phonelist = new Vector<SmartPhone>();

		phonelist.add(new SmartPhone(4, "Redmi", 8000));
		phonelist.add(new SmartPhone(6, "Oppo", 10000));
		phonelist.add(new SmartPhone(12, "Samsung", 33000));
		phonelist.add(new SmartPhone(8, "Motorola", 15000));

		// Comparator is an interface so direct object creation is not possible,
		// so we are creating an anonymous class
		Comparator<SmartPhone> com = new Comparator<SmartPhone>() {

			@Override
			public int compare(SmartPhone o1, SmartPhone o2) {
				if (o1.getRam() > o2.getRam())
					return 11; // can mention any positive number here , SWAP
				else
					return -11; // can mention any negative number here , NO SWAP
			}
		};
		
		Collections.sort(phonelist, com);
		
		phonelist.forEach(System.out::println);

	}

}
