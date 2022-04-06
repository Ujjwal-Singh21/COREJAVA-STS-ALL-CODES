package com.capg.corejava.methodHiding;

// overridden method -> static, overridding method -> static
// hence no error -> method hiding taking place.
// method resolution -> by Compiler -> based on reference type. (similar to method overloading) 
class ParentOne {
	// static method
	public static void display() {
		System.out.println("Parent");
	}
}

class ChildOne extends ParentOne {
	// static method
	public static void display() {
		System.out.println("Child");
	}
}

public class MethodHidingDemo3 {

	public static void main(String[] args) {

		ParentOne parent = new ParentOne();
		parent.display();

		ChildOne child = new ChildOne();
		child.display();

		ParentOne parent1 = new ChildOne();
		parent1.display();

	}

}
