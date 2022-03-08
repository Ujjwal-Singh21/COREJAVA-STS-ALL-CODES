package com.capg.corejava.methodHiding;

// overridden method -> static, overridding method -> non-static
// hence error -> This instance method from child cannot override the static method from Parent
class Parent {
	public static void display() {
		// Class level method/static method
		System.out.println("Parent");
	}
}

class Child extends Parent {
	// object level method/instance method
	public void display() {
		System.out.println("Child");
	}
}

public class MethodHidingDemo1 {

	public static void main(String[] args) {

		Child child = new Child();
		child.display();

	}

}
