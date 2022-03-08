package com.capg.corejava.exceptionhandling;

public class ExceptionDemo5throws {
	String name = "null";
	int k = 10;

	public void show() throws Exception {
		System.out.println(1);
		System.out.println(name.length());
		int t = k / 0;
		System.out.println(t);
		System.out.println(2);
	}

	public static void main(String[] arg) throws Exception {

//		try {
//			ExceptionDemo5throws exceptionDemo5 = new ExceptionDemo5throws();
//			exceptionDemo5.show(); // Unhandled exception type Exception // if not handled
//		} catch (Exception e1) {
//			System.out.println("I can handle : " + e1);
//		}
		
		// if not handled -> It says Unhandled exception type Exception 
			ExceptionDemo5throws exceptionDemo5 = new ExceptionDemo5throws();
			exceptionDemo5.show(); 
		
	}
}
