package com.capg.corejava.methodHiding;

// overridden method -> non-static, overridding method -> static
// hence error -> This static method from ChildClass cannot override the instance method from ParentClass.
class ParentClass {
	// object level method/instance method
	public void display() {
		System.out.println("Parent");
	}
}

class ChildClass extends ParentClass {
	// Class level method/static method
	public static void display() {
		System.out.println("Child");
	}
}

public class MethodHidingDemo2 {

	public static void main(String[] args) {

		ChildClass childclass = new ChildClass();
		childclass.display();

	}

}
