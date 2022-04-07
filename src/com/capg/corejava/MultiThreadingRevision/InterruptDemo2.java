package com.capg.corejava.MultiThreadingRevision;

//interrupt() call waiting untill target thread goes into either sleeping or waiting state.
//if target thread never goes in either sleeping or waiting state then interuppt() call gets wasted.
class MyThread13 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("I am lazy thread");
		}
		System.out.println("I am entering  into sleep state");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}

public class InterruptDemo2 {

	public static void main(String[] args) {

		MyThread13 myThread = new MyThread13();
		myThread.start();

		// main thread interuppting child thread after its first iteration of for loop
		myThread.interrupt();

		// code executed by main thread
		System.out.println("End of main");

	}

}
