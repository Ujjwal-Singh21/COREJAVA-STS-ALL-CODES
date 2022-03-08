package com.capg.corejava.exceptionhandling;

public class ExceptionDemo3 {
//	String name = "null";
	String name = null;
	int k = 10;

	public void show() {
		try {
			System.out.println(1);
			System.out.println(name.length()); 
			int t = k / 0;
			System.out.println(t);
			System.out.println(2);
		} catch (NullPointerException e1) {
			System.out.println("I can handle : " + e1);
		} catch (ArithmeticException e1) {
			System.out.println("I can handle : " + e1);

		// but better to write the exceptions ourself to avoid internal complexity
		} catch (Exception e1) {
			System.out.println("Some Exception Occured : " + e1);
		}
	}

	public static void main(String[] arg) {
		ExceptionDemo3 exceptionDemo3 = new ExceptionDemo3();
		exceptionDemo3.show();
	}
}
