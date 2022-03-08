package com.corejava.general;


interface I {
	
	// public int maximum(int num1,int num2);
	
	 default void show() {
		System.out.println("Interface I");
	}
}


interface J {
	
	//public int maximum(int num1,int num2);
	
	 default void show() {
		System.out.println("Interface J");
	}
}

class A {
	
	public void show() {
		System.out.println("Class A");
	}
}
public class B extends A implements I {

	public static void main(String[] args) {
		
		B b = new B();
		b.show();
	}

}
