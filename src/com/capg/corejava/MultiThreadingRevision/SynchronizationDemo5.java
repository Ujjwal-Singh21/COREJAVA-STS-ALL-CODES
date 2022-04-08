package com.capg.corejava.MultiThreadingRevision;

// 1) Creating 2 Display objects for both threads t1 and t2 separately, now output will be irregular because both will 
//    start executing synchronized block together simultaneousaly because both has their own display Objects.

// 2) So giving class as a parameter to synchronized block -> synchronized(Display.class)

// 3) So ONLY if a thread gets class level LOCK of Display class, then only it is allowed to execute this synchronized area.
//----------------------------------------------------------------------------------------------------------------------------
class Display3 {

	public void wish(String name) {

		// 1 Lakhs lines of code present here......

		synchronized (Display3.class) {
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

		// Again 1 Lakhs lines of code present here......
	}
}

class MyThreadd3 extends Thread {

	Display3 d;
	String name;

	MyThreadd3(Display3 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo5 {

	public static void main(String[] args) {

		Display3 d1 = new Display3();
		Display3 d2 = new Display3();

		MyThreadd3 t1 = new MyThreadd3(d1, "Dhoni");
		MyThreadd3 t2 = new MyThreadd3(d2, "Yuvaraj");

		t1.start();
		t2.start();

	}

}
