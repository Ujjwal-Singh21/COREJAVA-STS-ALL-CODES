package com.capg.corejava.multhithreading;

// by extending Thread class.
class Hi extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi");
			// to make delay in printing
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Hello extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {

		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		obj1.start();
		// to avoid both threads collision
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		obj2.start();

	}

}
