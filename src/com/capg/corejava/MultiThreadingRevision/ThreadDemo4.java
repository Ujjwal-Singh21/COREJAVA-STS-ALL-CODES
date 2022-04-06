package com.capg.corejava.MultiThreadingRevision;

//calling Parent Thread class start() method inside overridden start() method, which will result in creating a new child
//thread that will be responsible to execute the overridden run() method, which was not getting executed previously.
//----------------------------------------------------------------------------------------------------------------------------
class MyThread3 extends Thread {

	@Override
	public void start() {
		super.start();
		System.out.println("start method");
	}

	@Override
	public void run() {
		System.out.println("run method");
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();

		System.out.println("main method");
	}

}
