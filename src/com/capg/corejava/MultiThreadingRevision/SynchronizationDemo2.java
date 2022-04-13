package com.capg.corejava.MultiThreadingRevision;

// Example of CLASS LEVEL LOCK
//------------------------------
// 1) A thread needs to acquire a CLASS LEVEL LOCK if it needs to execute a static synchronized method.

// 2) Creating 2 different Display objects for both threads, and because of it both threads starts executing simultaneousaly 
//    which results in an irregular Output.

// 3) Hence we declare wish() method as static sync, and we start getting normal regular output, This is because to execute
//    a static sync method a thread requires a CLASS LEVEL LOCK, hence say thread t1 acquires that CLASS LEVEL LOCK and starts 
//    executing, meanwhile thread t2 has to wait for acquiring that CLASS LEVEL LOCK untill released by t1, once it gets it
//    it starts its execution.
//------------------------------------------------------------------------------------------------------------------------------
class Display1 {

	public static synchronized void wish(String name) {

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

class MyThreadd1 extends Thread {

	Display1 d;
	String name;

	MyThreadd1(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo2 {

	public static void main(String[] args) {

		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		
		MyThreadd1 t1 = new MyThreadd1(d1, "Dhoni");
		MyThreadd1 t2 = new MyThreadd1(d2, "Yuvaraj");

		t1.start();
		t2.start();

	}

}
