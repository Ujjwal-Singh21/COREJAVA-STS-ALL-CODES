package com.capg.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelevisionRunnerClass {

	public static void main(String[] args) {

		List<Television> list = new ArrayList<Television>();
		list.add(new Television("LG", 33000, 2010));
		list.add(new Television("SONY", 13000, 2015));
		list.add(new Television("ONEPLUS", 88000, 2021));

		Comparator<Television> comparator = new Comparator<Television>() {

			@Override
			public int compare(Television o1, Television o2) { // comparator method for comparison
				if (o1.getPrice() > o2.getPrice()) // logic to sort
					return 1;

				else
					return -1;
			}
		};

		Collections.sort(list, comparator); // sort method from collections class to sort

		for (Television t : list) {
			System.out.println(t);
		}
	}
}
