package com.capg.corejava.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelevisionRunnerClass {

	public static void main(String[] args) {

		List<Television> tvList = new ArrayList<>();
		
		tvList.add(new Television("LG", 33000, 2010));
		tvList.add(new Television("SONY", 13000, 2015));
		tvList.add(new Television("ONEPLUS", 88000, 2021));

		Comparator<Television> tvComparator = new Comparator<Television>() {
			@Override
			public int compare(Television tv1, Television tv2) {
				return tv1.getPrice() - tv2.getPrice();
			}
		};

		Collections.sort(tvList, tvComparator); 

		for (Television t : tvList) {
			System.out.println(t);
		}
	}
}
