package com.capg.corejava.MultiThreadingRevision;

//Child thread waiting for main thread
//-------------------------------------
class MyThread10 extends Thread {

	static Thread mt;

	@Override
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("Sita Thread");
		}
	}
}

public class JoinDemo2 {

	public static void main(String[] args) throws InterruptedException {

		// assigning main thread object to child thread class static variable
		MyThread10.mt = Thread.currentThread();

		MyThread10 myThread = new MyThread10();
		myThread.start();

		// for loop executd by main Thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ram Thread");
			Thread.sleep(2000);
		}
	}

}
