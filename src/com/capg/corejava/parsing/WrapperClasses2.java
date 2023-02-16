package com.capg.corejava.parsing;

public class WrapperClasses2 {

	public static void main(String[] args) {

		// practise
		int value = 3546;
		Integer integer = new Integer(value);
		System.out.println("Boxing :" + integer);

		Integer integer1 = 4567;
		System.out.println("AutoBoxing :" + integer1);

		int newValue = integer.intValue();
		System.out.println("Unboxing :" + newValue);

		int newValue2 = integer1;
		System.out.println("Auto UnBoxing :" + newValue2);

	}
}
