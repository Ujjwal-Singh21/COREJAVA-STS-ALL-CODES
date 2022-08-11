package com.capg.corejava.constructors;

// This is made for comparison and understanding Recursive Constructor call concept more better.
// Here untill we dont call m1() in method, code runs successfully,
// But When we call m1() in main method, while runtime it throws an error that says,
// Error -> Exception in thread "main", -> Java.lang.StackOverFlowError.
// Hence, recursive method call is always a RunTime error.
//------------------------------------------------------------------------------------------------

public class RecursiveMethodCall {

	public static void m1() {
		m2();
	}

	public static void m2() {
		m1();
	}

	public static void main(String[] args) {
		m1();
		System.out.println("hello");
	}

}
