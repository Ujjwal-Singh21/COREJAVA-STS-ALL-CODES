package com.capg.corejava.exceptionhandling;

public class ExceptionDemo6throws {
//	String name = "null";
	String name = null;
	int k = 10;

	public void show() throws Exception {
		System.out.println(1);
		System.out.println(name.length());
		int t = k / 10;
		System.out.println(t);
		System.out.println(2);
	}

	public void display() throws Exception {
		show();
	}

	public static void main(String[] arg) {
		// if not handled -> It says Unhandled exception type Exception 
		try {
			ExceptionDemo6throws exceptionDemo6 = new ExceptionDemo6throws();
			exceptionDemo6.display();
		} catch (Exception e1) {
			System.out.println("I can handle : " + e1);
		}
	}
}
