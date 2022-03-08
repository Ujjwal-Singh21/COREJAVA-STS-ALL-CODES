package com.capg.corejava.exceptionhandling;

public class ExceptionDemo1 {
	String name = null;

	// java.lang.NullPointerException: Cannot invoke "String.length()" because "this.name" is null
	public void show() {
		System.out.println(name.length());
	}

	public static void main(String[] arg) {
		ExceptionDemo1 exceptionDemo1 = new ExceptionDemo1();
		exceptionDemo1.show();
	}
}
