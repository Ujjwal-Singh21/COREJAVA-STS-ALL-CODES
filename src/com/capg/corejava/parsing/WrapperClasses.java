package com.capg.corejava.parsing;

public class WrapperClasses {

	public static void main(String[] args) {

		int i = 5;
		Integer r = new Integer(i); // method 1 called as boxing
		System.out.println("Boxing: " + r);

		Integer r1 = i; // method 2 called as auto boxing
		System.out.println("Auto Boxing: " + r1);

		int t = r.intValue(); // method 1 called as unboxing
		System.out.println("UnBoxing: " + t);

		int t1 = r1; // method 2 called as auto unboxing
		System.out.println("Auto UnBoxing: " + t1);

		System.out.println("Normal Printing: " + i); // normal printing

	}

}
