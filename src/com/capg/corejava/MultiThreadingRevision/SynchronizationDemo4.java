package com.capg.corejava.MultiThreadingRevision;

// An example for synchronized {} block.
// Just enclosing the for loop inside wish() method with synchronized block
// So that lines before and after this synchronized {} block gets executed by multiple threads and thread waiting time reduces.
//-------------------------------------------------------------------------------------------------------------------------------
class Display2 {

	public void wish(String name) {

		// 1 Lakhs line of code present here...........

		synchronized (this) {
			
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

		// Again 1 Lakhs line of code present here..........
	}
}

class MyThreadd2 extends Thread {

	Display2 d;
	String name;

	MyThreadd2(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo4 {

	public static void main(String[] args) {

		Display2 d = new Display2();
		
		MyThreadd2 t1 = new MyThreadd2(d, "Dhoni");
		MyThreadd2 t2 = new MyThreadd2(d, "Yuvaraj");

		t1.start();
		t2.start();

	}
}
