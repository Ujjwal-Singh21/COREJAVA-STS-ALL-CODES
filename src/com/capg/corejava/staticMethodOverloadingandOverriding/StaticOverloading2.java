package com.capg.corejava.staticMethodOverloadingandOverriding;

// Can we overload methods that differ only by static keyword...? 
// We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of 
// parameters is the same). See the following Java program for example.
//--------------------------------------------------------------------------------------------------------------------
public class StaticOverloading2 {

	public static void foo() {
		System.out.println("Test.foo() called ");
	}

	// Duplicate method foo() in type StaticOverloading2.
	// Compiler Error: cannot redefine foo()
	public void foo() {
		System.out.println("Test.foo(int) called ");
	}

	public static void main(String args[]) {
		StaticOverloading2.foo();
	}

}
