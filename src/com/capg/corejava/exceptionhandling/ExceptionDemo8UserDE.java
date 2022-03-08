package com.capg.corejava.exceptionhandling;

class AgeNotSupportException extends Exception {
	AgeNotSupportException(String message) {
		System.out.println("Hello.... " + message);
	}
}

public class ExceptionDemo8UserDE {
	int age = 18;

	public void show() {
		try {
			if (age <= 18)
				throw new AgeNotSupportException("Your are not eligible");
			else
				System.out.println("Hello.... Your are eligible");
		} catch (Exception e1) {
			System.out.println("I can handle : " + e1);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo8UserDE exceptionDemo8 = new ExceptionDemo8UserDE();
		exceptionDemo8.show();
	}
}