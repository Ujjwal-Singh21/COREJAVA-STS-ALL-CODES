package com.corejava.general;

@FunctionalInterface
interface MyInterface {
	public abstract int add(int a, int b);
//	public abstract int sub(int a, int b);
//	public abstract int mul(int a, int b);
//	public abstract int div(int a, int b);

	default void display() {
		System.out.println("Hello");
	}
	
	static void show() {
		System.out.println("Static Method");
	}
}

public class DemoClass implements MyInterface {
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public void display() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {

		MyInterface m = new DemoClass();
		int result = m.add(20, 20);
		System.out.println(result);
		
		DemoClass d = new DemoClass();
		System.out.println(d.add(10, 10));
		d.display();
		
		MyInterface.show();
	}

}
