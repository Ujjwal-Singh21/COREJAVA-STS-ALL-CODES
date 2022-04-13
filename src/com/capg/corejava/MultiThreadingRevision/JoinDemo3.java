package com.capg.corejava.MultiThreadingRevision;

//Child thread waiting for main thread & Main thread waiting for Child thread
//Because of it the program output is empty and it is stucked forever.
//--------------------------------------------------------------------------------
class MyThread11 extends Thread {

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

public class JoinDemo3 {

	public static void main(String[] args) throws InterruptedException {

		// assigning main thread object to child thread class static variable
		MyThread11.mt = Thread.currentThread();

		MyThread11 t = new MyThread11();
		t.start();
		t.join();

		// for loop executd by main Thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ram Thread");
			Thread.sleep(2000);
		}
	}

}
