package com.capg.corejava.thisandsuper;

// 1) this() -> used to call current class constructor, and can be used only as 1st line/statement inside a constructor.
//    this -> used to access current class instance variables/members.
// 2) super() -> used to call parent class constructor, and can be used only as 1st line/statement inside a constructor.
//    super -> used to access parent class instance variables/members.
//----------------------------------------------------------------------------------------------------------------------
class Parent {
	
	String name = "Parent";
	int rollno = 1000;

	public void show() {
		System.out.println("Parent class method");
	}
}

public class Demo1 extends Parent {

	String name = "Child";
	int rollno = 500;

	public void show() {
		System.out.println("Child class method");
	}

	public void display() {
		System.out.println("Name: " + this.name + " & Rollno: " + this.rollno);
		System.out.println("Name: " + super.name + " & Rollno: " + super.rollno);
		this.show();
		super.show();
	}

	public static void main(String[] args) {

		Demo1 demo = new Demo1();
		demo.display();
	}
}
