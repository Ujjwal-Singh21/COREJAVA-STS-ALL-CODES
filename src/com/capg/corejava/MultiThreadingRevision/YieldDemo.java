package com.capg.corejava.MultiThreadingRevision;

//yield() method causes to pause the currently executing thread to give chance to waiting threads of same priority.
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

		MyThread8 t = new MyThread8();
		t.start();

		// for loop executd by main Thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}

	}

}
