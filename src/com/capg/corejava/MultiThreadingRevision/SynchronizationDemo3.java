package com.capg.corejava.MultiThreadingRevision;

//Another example to understand synchronization concept more better :-
//-----------------------------------------------------------------------
class Displayy {

	// method-1
	public synchronized void displayn() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

	// method-2
	public synchronized void displayc() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

//Thread Class 1
class MyThreadDemo1 extends Thread {
	Displayy d;

	MyThreadDemo1(Displayy d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayn();
	}
}

//Thread Class 2
class MyThreadDemo2 extends Thread {
	Displayy d;

	MyThreadDemo2(Displayy d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayc();
	}
}

public class SynchronizationDemo3 {

	public static void main(String[] args) {

		Displayy d = new Displayy();

		MyThreadDemo1 t1 = new MyThreadDemo1(d);
		MyThreadDemo2 t2 = new MyThreadDemo2(d);

		t1.start();
		t2.start();
	}

}
