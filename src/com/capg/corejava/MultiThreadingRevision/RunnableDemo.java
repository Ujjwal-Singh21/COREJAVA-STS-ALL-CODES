package com.capg.corejava.MultiThreadingRevision;

//Runnable(I) -> present is Java.lang package -> has only one method that is run() method.
//Since it does not have start() method hence we cannot start our thread.
//Therefore we create Object of Thread(C),
//And pass the reference of our Runnable Implementation class to Thread class Constructor
//----------------------------------------------------------------------------------------
class MyRunnable implements Runnable {

	@Override
	public void run() {
		// Code executed by child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();

		// creating Thread class Object to use its start() method
		Thread t = new Thread(r);
		t.start();

		// Code executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
