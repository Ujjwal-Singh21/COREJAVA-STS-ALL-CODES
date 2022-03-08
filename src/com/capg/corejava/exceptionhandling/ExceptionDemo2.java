package com.capg.corejava.exceptionhandling;

public class ExceptionDemo2 {
//	String name = "null"; // says 4 since its declared in quotes as String
	String name = null; // throws exeception

	public void show() {
		try {
			System.out.println(1);
			System.out.println(name.length());
			System.out.println(2);
		} catch (NullPointerException e1) {
			System.out.println("I can handle :" + e1);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo2 exceptionDemo2 = new ExceptionDemo2();
		exceptionDemo2.show();
	}
}
