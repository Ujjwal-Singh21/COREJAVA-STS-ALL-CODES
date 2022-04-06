package com.capg.corejava.multhithreading;

// by implementing runnable interface and lambda expression, without anonymous class.
public class ThreadDemo4 {

	public static void main(String[] args) {

		Runnable obj1 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				// to make delay in printing
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		Runnable obj2 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		// to avoid both threads collison
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
	}
}
