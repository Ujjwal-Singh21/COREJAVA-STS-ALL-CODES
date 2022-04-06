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
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Main thread name by user");
		System.out.println(Thread.currentThread().getName());

		// getting and setting name of Child Thread
		MyThread4 myThread4 = new MyThread4();
		System.out.println(myThread4.getName()); // -> Thread-0 by default given by JVM
		myThread4.setName("First thread name by user");
		System.out.println(myThread4.getName()); // -> First thread name by user

		// Since we have changed the name of main thread
		// Now it will say exception in thread -> Main thread name by user
		System.out.println(10 / 0);

	}

}
