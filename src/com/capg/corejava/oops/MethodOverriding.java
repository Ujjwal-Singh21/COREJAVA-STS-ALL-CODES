package com.capg.corejava.oops;

// SAME METHOD NAME
// SAME PARAMETERS
// SAME RETURN TYPE
// HAPPENS IN TWO DIFFERENT CLASSES OR INTERFACES THROUGHT INHERITENCE
class MyTest {

	public void display() {
		System.out.println("display method......Parent");
	}
}

public class MethodOverriding extends MyTest {

	public void display() {
		System.out.println("display method......Child");
	}

	public static void main(String[] args) {

		MethodOverriding movr = new MethodOverriding();
		movr.display();

		// main parent class object and reference creation
		MyTest mytest = new MyTest();
		mytest.display();

		// main class reference and child class object creation
		MyTest mytest2 = new MethodOverriding();
		mytest2.display();
	}
}
