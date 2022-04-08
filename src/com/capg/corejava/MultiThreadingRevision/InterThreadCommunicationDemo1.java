package com.capg.corejava.MultiThreadingRevision;

class ThreadB extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {

			System.out.println("Child Thread Starts Calculation");

			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}

			System.out.println("Child Thread Completes Calculation & Trying To Give Notification");
			this.notify();

		}
	}
}

public class InterThreadCommunicationDemo1 {

	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {

			System.out.println("Main Thread Trying To Call Wait Method");

			b.wait();

			System.out.println("Main Thread Got Notification From Child Thread");

			System.out.println(b.total);
		}

	}

}
