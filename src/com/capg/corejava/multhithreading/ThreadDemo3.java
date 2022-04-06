package com.capg.corejava.multhithreading;

// by implementing runnable interface by removing Separate class for Implementation and by using Inner anonymous class.
public class ThreadDemo3 {

	public static void main(String[] args) {

		// creating reference of Runnable(I) using inner anonymous class
		Runnable obj1 = new Runnable() {

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

		};

		Runnable obj2 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}

		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		// to avoid both threads collision
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();

	}

}
