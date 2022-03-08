package com.capg.corejava.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		// method 1 to declare strings
		// both hello created at different memory locations with difference reference variables.
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		// method 2 to declare strings
		// both hello create at same memory location with same reference variable
		String S1 = "HELLO";
		String S2 = "HELLO";

		if (str1 == str2)
			System.out.println("true");
		else
			System.out.println("false");

		if (str1.equals(str2))
			System.out.println("true");
		else
			System.out.println("false");

		if (S1 == S2)
			System.out.println("true");
		else
			System.out.println("false");

		if (S1.equals(S2))
			System.out.println("true");
		else
			System.out.println("false");

	}

}