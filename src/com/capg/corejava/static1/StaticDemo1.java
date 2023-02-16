package com.capg.corejava.static1;

public class StaticDemo1 {

	private static String cname = "India"; // static variable
	private String myname = "Ujjwal"; // non static variable

	static public void myprint() // static method
	{
		System.out.println("COUNTRY NAME: " + cname);
	}

	public void display() // non static method
	{
		myprint(); // non static method calling static method inside it
		System.out.println(StaticDemo1.cname); // non static method calling static variable inside it

		System.out.println("MY NAME: " + myname);
	}

	public static void main(String[] args) {

		System.out.println(StaticDemo1.cname); // calling static variable -> classname.variablename
		StaticDemo1.myprint(); // calling static method -> classname.methodname

		StaticDemo1 st = new StaticDemo1();
		st.display(); // calling normal non static method

	}

}
