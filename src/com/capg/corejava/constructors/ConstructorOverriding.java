package com.capg.corejava.constructors;

// Constructors does not support Inheritence and overriding concept.
class Parent {
	Parent() {
		System.out.println("Parent no arg constructor");
	}
}

class Child extends Parent {

	Child(int a) {
		System.out.println("Child with arg constructor");
	}
}

public class ConstructorOverriding {

	public static void main(String[] args) {

		// Parent class no arg constructor executes.
//		Parent parent = new Parent();

		// Error -> says The constructor Child() is undefined.
		// This rpoves that no-arg constructor from parent class in not inherited and not available to child class.
		// Hence constructor does not support Overriding concept.
		Child child = new Child();

	}

}
