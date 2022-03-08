package com.capg.corejava.final1;

class MyClass {
	final public void myshow() {
		System.out.println("my test class method");
	}
}

public class FinalDemo2 extends MyClass {
	/*
	 * public void myshow(); cannot override final method myshow();
	 */

	final String countryname = "India";
	String cityname = "Bengaluru";

	public void display() {

		System.out.println("COUNTRY NAME :" + countryname);
	}

	public void show() {
		System.out.println("CITY NAME :" + cityname);
	}

	public static void main(String[] args) {

		FinalDemo2 fd2 = new FinalDemo2();
		fd2.display();
		fd2.show();

	}

}
