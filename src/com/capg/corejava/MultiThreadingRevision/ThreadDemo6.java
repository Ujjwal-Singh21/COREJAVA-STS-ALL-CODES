package com.capg.corejava.MultiThreadingRevision;

class MyThread5 extends Thread {
	
	@Override
	public void run() {
		System.out.println("run() method executed by Thread: " + Thread.currentThread().getName());
	}
}

public class ThreadDemo6 {

	public static void main(String[] args) {

		MyThread5 t = new MyThread5();
		t.start();

		System.out.println("main() method executed by Thread: " + Thread.currentThread().getName());

	}

}
