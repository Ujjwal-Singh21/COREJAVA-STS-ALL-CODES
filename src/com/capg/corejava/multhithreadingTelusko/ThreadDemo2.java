package com.capg.corejava.multhithreadingTelusko;

// by implementing runnable interface which has internally only run() method.
class Hii implements Runnable {

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

class Helloo implements Runnable {

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

public class ThreadDemo2 {

	public static void main(String[] args) {

		// Hii obj1 = new Hii();
		Runnable obj1 = new Hii();
		// Helloo obj2 = new Helloo();
		Runnable obj2 = new Helloo();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		// to avoid both threads collision
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();

	}

}
