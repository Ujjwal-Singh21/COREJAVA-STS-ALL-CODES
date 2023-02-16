package com.capg.corejava.MultiThreadingRevision;

//getting and setting the Name of the Thread
class MyThread4 extends Thread {
	@Override
	public void run() {
		System.out.println("Run method");
	}
}

public class ThreadDemo5 {

	public static void main(String[] args) {

		// getting and setting name of main Thread
		System.out.println(Thread.currentThread().getName()); // main
		Thread.currentThread().setName("User main");
		System.out.println(Thread.currentThread().getName()); // User Main

		// getting and setting name of Child Thread
		MyThread4 t = new MyThread4();
		System.out.println(t.getName()); // -> Thread-0, by default given by JVM
		t.setName("User First Thread");
		System.out.println(t.getName()); // -> User First Thread

		// Since we have changed the name of main thread
		// Now it will say exception in thread -> "User main" java.lang.ArithmeticException: / by zero
		System.out.println(10 / 0);

	}

}
