package com.capg.corejava.MultiThreadingRevision;

class MyThread12 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}
}

public class InterruptDemo1 {

	public static void main(String[] args) {

		MyThread12 t = new MyThread12();
		t.start();

		// main thread interrupting child thread after its first iteration of for-loop
		t.interrupt();

		// code executed by main thread
		System.out.println("End of main");

	}

}
