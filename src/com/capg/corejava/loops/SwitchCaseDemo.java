package com.capg.corejava.loops;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		String grade = "C";

		switch (grade) {

		case "A":
			System.out.println("excellent");
			break;

		case "B":
			System.out.println("two");
			break;
		case "C":
			System.out.println("three");
			break;
		case "D":
			System.out.println("four");
			break;
		case "E":
			System.out.println("five");
			break;

		default:

			System.out.println("some random number".toUpperCase());

		}

	}
}
