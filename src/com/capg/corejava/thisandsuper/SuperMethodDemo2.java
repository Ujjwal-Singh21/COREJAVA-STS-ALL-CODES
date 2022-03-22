package com.capg.corejava.thisandsuper;

class ClassA {
	ClassA() {
		System.out.println("Class A constructor");
	}

	ClassA(int i) {
		System.out.println("Class A int");
	}
}

class ClassB extends ClassA {
	ClassB() {
		// to call parent class Parameterized constructor, while calling child class
		// default constructor.
		super(4);
		System.out.println("Class B constructor");
	}

	ClassB(int i) {
		// To call Parent class Parameterized constructor, while calling Child class
		// Parameterized constructor.
		// We pass in an number in super() method.
		super(i);
		System.out.println("Class B int");
	}
}

public class SuperMethodDemo2 {

	public static void main(String[] args) {

		// Normal -> A, then -> A then B
		ClassA a1 = new ClassA();
		ClassB b1 = new ClassB();

		// Calling the parameterized constructor
		// output -> Class A int, then -> Class A constructor, Class B int
		ClassA a2 = new ClassA(5);
		ClassB b2 = new ClassB(5);
	}

}
