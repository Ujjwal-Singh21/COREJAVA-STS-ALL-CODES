package com.capg.corejava.oops;

//HAPPENS IN SAME CLASS
//SAME METHOD NAME
//RETURN TYPE MAY OR MAY NOT BE SAME
//PARAMETERS SHOULD BE DIFFERENT

public class MethodOverloading {

	public int add(int a) {
		System.out.println("A value: " + a);
		return a;
	}

	public void add(int a, int b) {
		System.out.println("Addition value: " + (a + b));
	}

	public void add(double d1, double d2) {
		System.out.println("Double Addition  value: " + (d1 + d2));

	}

	public void add(String name) {
		System.out.println(name);

	}

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.add(77);
		mol.add(77, 23);
		mol.add(55.5, 45.5);
		mol.add("Ravi");

	}

}
