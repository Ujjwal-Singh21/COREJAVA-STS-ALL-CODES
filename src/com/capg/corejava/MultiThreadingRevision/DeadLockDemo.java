package com.capg.corejava.MultiThreadingRevision;

// In this program if we remove atleast 1 synchronized keyword from any of the methods,
// Then the program will not enter into DeadLock situation,
// Hence synchronized keyword is the only reason for DEADLOCK SITUATION.
// So take special care while using synchronized keyword.
//--------------------------------------------------------------------------------------
class A {

	public synchronized void d1(B b) {
		
		System.out.println("Thread 1 (Main Thread) starts execution of d1 method");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		System.out.println("Thread 1 trying to call last() method from B");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Last Method from A");
	}
}

class B {

	public synchronized void d2(A a) {
		System.out.println("Thread 2 (Child Thread) starts execution of d2 method");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		System.out.println("Thread 2 trying to call last() method from A");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Last Method from B");
	}
}

class DeadLock extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start(); // internally as t.start -> so main thread starting the child thread here,
		// now we have 2 threads main & child
		a.d1(b); // this method call is done by main thread
	}

	@Override
	public void run() {
		b.d2(a); // this method call is done by child thread
	}
}

public class DeadLockDemo {

	public static void main(String[] args) {

		// main thread creates child thread object and then calls m1() method.
		DeadLock d = new DeadLock();
		d.m1();

	}
}
