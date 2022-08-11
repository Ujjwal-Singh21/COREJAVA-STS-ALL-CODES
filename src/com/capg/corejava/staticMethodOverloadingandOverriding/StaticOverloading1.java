package com.capg.corejava.staticMethodOverloadingandOverriding;

// Overloading is also a feature of OOP languages like Java that is related to compile-time (or static) polymorphism. 
// This feature allows different methods to have the same name, but different signatures, especially the number of 
// input parameters and type of input parameters.
//--------------------------------------------------------------------------------------------------------------------
// Can we overload static methods? 
// The answer is ‘Yes’. We can have two or more static methods with the same name, but differences in input parameters. 
// For example, consider the following Java program. 
//--------------------------------------------------------------------------------------------------------------------
public class StaticOverloading1 {

	public static void foo() {
		System.out.println("Test.foo() called ");
	}

	public static void foo(int a) {
		System.out.println("Test.foo(int) called ");
	}

	public static void main(String args[]) {
		StaticOverloading1.foo();
		StaticOverloading1.foo(10);
	}
}
