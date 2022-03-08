package com.capg.corejava.final1;

final class MyClass1 {
	public void myshow() {
		System.out.println("my final class method");
	}
}

public class FinalDemo3
//if used -> extends MyClass1 -> The type FinalDemo3 cannot subclass the final class MyClass1
{

	final String countryname = "India";
	String cityname = "Bengaluru";

	public void display() {

		System.out.println("COUNTRY NAME :" + countryname);
	}

	public void show() {
		System.out.println("CITY NAME :" + cityname);
	}

	public static void main(String[] args) {

		FinalDemo3 fd2 = new FinalDemo3();
		fd2.display();
		fd2.show();

		MyClass1 myclass1 = new MyClass1(); // creating object for final class to access final class method
		myclass1.myshow();

	}

}
