package com.corejava.general;

import java.util.ArrayList;
import java.util.List;

public class StramApi {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		list.parallelStream().forEach(System.out::println);
		

	}

}
