package com.capg.corejava.parsing;

public class ParsingDemo1 {

	public static void main(String[] args) {

		// String to int
		String string = "12345";
		int value = Integer.parseInt(string);
		System.out.println(value + 4);

		// int to String
		int integer = 54321;
		String string1 = Integer.toString(integer);
		System.out.println(string1 + 3);
		System.out.println(string1.length());

		// adding two Strings
		String str1 = "Ujjwal";
		String str2 = "Singh";
		System.out.println(str1 + " " + str2);
		System.out.println(str1 + str2);

	}

}
