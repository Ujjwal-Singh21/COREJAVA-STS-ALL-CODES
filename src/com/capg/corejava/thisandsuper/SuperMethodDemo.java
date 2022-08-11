package com.capg.corejava.thisandsuper;

// 1)this() -> used to call current class constructor, and can be used only as 1st line/statement inside a constructor.
// 2)super() -> used to call parent class constructor, and can be used only as 1st line/statement inside a constructor.
//---------------------------------------------------------------------------------------------------------------------
class A {
	A() {
		System.out.println("Class A constructor");
	}
}

class B extends A {
	B() {
		super();  // always available, whether we write or not.
		System.out.println("Class B constructor");
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		A a = new A();  // Calls A class Constructor.
		B b = new B();  // Calls Parent A class Constructor first, then calls its own constructor.
	}

}
