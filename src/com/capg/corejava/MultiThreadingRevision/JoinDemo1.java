package com.capg.corejava.MultiThreadingRevision;

//Main thread waiting for Child thread
//-------------------------------------
class MyThread9 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class JoinDemo1 {

	public static void main(String[] args) throws InterruptedException {

		MyThread9 t = new MyThread9();
		t.start();

		// main thread calling join() method on child thread object,
		// hence he will be in waiting state untill child thread completes,
		// after that he will come out of waiting state and continue its execution.
		//------------------------------------------------------------------------------
		t.join();

		// if main thread wants to wait for child thread but only for 10 seconds
//		t.join(10000);

		// for loop executd by main Thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ram Thread");
		}
	}
}
