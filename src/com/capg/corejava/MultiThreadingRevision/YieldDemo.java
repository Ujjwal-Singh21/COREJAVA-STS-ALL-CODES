package com.capg.corejava.MultiThreadingRevision;

class MyThread8 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class YieldDemo {

	public static void main(String[] args) {

		MyThread8 myThread = new MyThread8();
		myThread.start();

		// for loop executd by main Thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}

	}

}
