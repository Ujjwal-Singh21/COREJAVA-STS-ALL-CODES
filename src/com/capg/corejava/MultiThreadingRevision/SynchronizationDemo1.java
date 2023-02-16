package com.capg.corejava.MultiThreadingRevision;

//1) If method wish() is declared as non-sync, then both threads t1 & t2 will try to execute the wish() method on the same
//   Display Object simultaneously, hence the output is irregular.

//2) If we declare wish() method as synchronized, then at a time only 1 thread from either of t1 or t2 will acquire LOCK on 
//   Display Object and starts executing it, meanwhile other thread has to wait untill first thread execution completes.

//3) After that only the first thread will release the LOCK and then the 2nd waiting thread will acquire LOCK on Display Object
//   and starts its execution, So output we will get will be very normal & regular.

//4) That's why it is said that if a method is declared as synchronized then at a time only 1 thread can execute that method
//   on the Current Object. Meanwhile All the remaining threads has to wait.
//------------------------------------------------------------------------------------------------------------------------------
class Display {

	public synchronized void wish(String name) {

		for (int i = 1; i <= 10; i++) {
			System.out.print("Good Morning: ");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(name);
		}
	}
}

class MyThreadd extends Thread {

	Display d;
	String name;

	MyThreadd(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo1 {

	public static void main(String[] args) {

		Display d = new Display();
		
		MyThreadd t1 = new MyThreadd(d, "Dhoni");
		MyThreadd t2 = new MyThreadd(d, "Yuvaraj");

		t1.start();
		t2.start();

	}
}
