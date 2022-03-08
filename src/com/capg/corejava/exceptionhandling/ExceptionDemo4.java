package com.capg.corejava.exceptionhandling;

public class ExceptionDemo4 {
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
		} catch (Exception e1) {
			System.out.println("Some Exception Occured : " + e1);
		}
		// close connections
		finally {

			System.out.println("finally block to close all connections");
		}
	}

	public static void main(String[] arg) {
		ExceptionDemo4 exceptionDemo4 = new ExceptionDemo4();
		exceptionDemo4.show();
	}
}
