package com.capg.corejava.staticMethodOverloadingandOverriding;

// Can we Override static methods in java? 
// We can declare static methods with the same signature in the subclass, but it is not considered overriding as 
// there won�t be any run-time polymorphism. Hence the answer is �No�. 
// If a derived class defines a static method with the same signature as a static method in the base class, 
// the method in the derived class is hidden by the method in the base class. 
//--------------------------------------------------------------------------------------------------------------------
/* Java program to show that if static method is redefined by a derived class, then it is not overriding. */
//----------------------------------------------------------------------------------------------------------------------

//Superclass
class Base {

	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("Static or class method from Base");
	}

	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}

//Subclass
class Derived extends Base {

	// This method is hidden by display() in Base
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	// This method overrides print() in Base
	@Override
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
}

//Driver class
public class StaticOverriding {
	public static void main(String args[]) {
		
		Base obj1 = new Derived();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it calls Base's display()
		obj1.display();

		// Here overriding works and Derive's print() is called
		obj1.print();
	}
}
