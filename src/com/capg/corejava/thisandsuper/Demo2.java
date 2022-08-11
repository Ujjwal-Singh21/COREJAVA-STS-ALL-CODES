package com.capg.corejava.thisandsuper;

// super keyword with multiple inheritence through interfaces.
//==============================================================

//Interface 1
//-------------
interface firstInterface {

	default void show() {
		System.out.println("First Interface");
	}
}

//Interface 2
//-------------
interface secondInterface {

	default void show() {
		System.out.println("Second Interface");
	}
}

// Main class
// Implementation class code
//----------------------------
public class Demo2 implements firstInterface, secondInterface {

	// Using super keyword to call the show method of both interfaces
	public void show() {
		firstInterface.super.show();
		secondInterface.super.show();
	}

	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();
		demo2.show();
	}
}
