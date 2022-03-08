package com.capg.corejava.oops;

public class Calculation {
	// attributes
	int a = 5, b = 10, c;

	// method
	public void addition() {
		c = a + b;
		System.out.println(" Addition : " + c);
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation(); // object creation and reference variable creation
		cal.addition(); // calling method using reference variable
	}

}
