package com.capg.corejava.exceptionhandling;

class AgeNotSupportException1 extends Exception {
	AgeNotSupportException1(String message) {
		System.out.println("Hello.. " + message);
	}
}

public class ExceptionDemo7UserDE {
	int age = 10; // not eligible -> if block executes 
//	int age = 20; // eligible -> else block executes 

	public void show() throws AgeNotSupportException1 {
		if (age <= 18)
			throw new AgeNotSupportException1("Your are not eligible");
		else
			System.out.println("Hello.. Your are eligible");
	}

	public static void main(String[] args) {
		// if not handled -> It says Unhandled exception type Exception 
		try {
			ExceptionDemo7UserDE exceptionDemo7 = new ExceptionDemo7UserDE();
			exceptionDemo7.show();
		} catch (Exception e1) {
			System.out.println("I can handle : " + e1);
		}
	}
}
