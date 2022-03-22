package com.capg.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelevisionRunnerClass {

	public static void main(String[] args) {

		List<Television> tvList = new ArrayList<Television>();
		
		tvList.add(new Television("LG", 33000, 2010));
		tvList.add(new Television("SONY", 13000, 2015));
		tvList.add(new Television("ONEPLUS", 88000, 2021));

		Comparator<Television> comparator = new Comparator<Television>() {

			// Overridden Comparator's Interface compare() method for comparison.
			@Override
			public int compare(Television o1, Television o2) {

				// logic to sort
				if (o1.getPrice() > o2.getPrice())
					return 1;

				else
					return -1;
			}
		};

	   // sort method from Collections class to sort
		Collections.sort(tvList, comparator); 

		for (Television t : tvList) {
			System.out.println(t);
		}
	}
}
