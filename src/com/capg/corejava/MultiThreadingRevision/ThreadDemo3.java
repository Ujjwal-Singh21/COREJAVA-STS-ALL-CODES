package com.capg.corejava.MultiThreadingRevision;

//Overriding start() method and providing an implmentation to it.
//Now since we are not giving any chance for the Thread class start method to get executed.
//overridden start() method in child class will get called just like a normal method call, and
//No new thread will get created. Hence,
//overridden run() method will never get executed.
//-------------------------------------------------------------------------------------------------------
class MyThread2 extends Thread {

	@Override
	public void start() {
		System.out.println("start method");
	}

	@Override
	public void run() {
		System.out.println("run method");
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();

		System.out.println("main method");
	}

}
