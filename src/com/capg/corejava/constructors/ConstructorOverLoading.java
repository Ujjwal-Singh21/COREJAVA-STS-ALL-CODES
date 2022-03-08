package com.capg.corejava.constructors;

// Constructor supports overloading concept.
class Test {
	Test(double d) {
		this(10);
		System.out.println("Double-arg Constructor");
	}

	Test(int i) {
		this();
		System.out.println("int-arg Constructor");
	}

	Test() {
		System.out.println("No-arg Constructor");
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		// Flow - No-arg -> int-arg -> double-arg
		Test test1 = new Test(20.5);

		// Flow - No-arg -> int-arg
		Test test2 = new Test(20);

		// Flow - No-arg
		Test test3 = new Test();

	}

}
