package com.corejava.general;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5);
		
		list.stream().map(i -> i.toString(2)).forEach(System.out::println);

	}

}
