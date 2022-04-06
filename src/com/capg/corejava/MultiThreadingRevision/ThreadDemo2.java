package com.capg.corejava.MultiThreadingRevision;

//OverLoading of run method in Child class
class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("no-arg run method");
	}

	public void run(int i) {
		System.out.println("int-arg run method");
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start(); // -> Thread class start() method will always call no-arg run() method only
		myThread1.run(10); // -> calling 2nd overloaded run() method like a normal method call

	}

}
