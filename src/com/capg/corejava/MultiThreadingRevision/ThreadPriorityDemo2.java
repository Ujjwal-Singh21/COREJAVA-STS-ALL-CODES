package com.capg.corejava.MultiThreadingRevision;

//Setting high priority for Child Thread to make it get executed first.
//But all OS does not provide proper support for Thread Priority.
//------------------------------------------------------------------------
class MyThread7 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadPriorityDemo2 {

	public static void main(String[] args) {
		
		MyThread7 myThread = new MyThread7();
		myThread.setPriority(10);
		myThread.start();

		// for loop executd by main Thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}

	}

}
