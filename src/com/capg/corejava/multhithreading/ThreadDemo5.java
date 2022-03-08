package com.capg.corejava.multhithreading;

// by implementing runnable interface and lambda expression , anonymous class and removing runnable obj1 and 2

public class ThreadDemo5 {

	public static void main(String[] args) {

		Thread t1 = new Thread( () ->
		{
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(500);} catch (Exception e) {} // to make delay in printing
			}
		});
		Thread t2 = new Thread(() ->
		{
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);} catch (Exception e) {}
			}
		});

		t1.start();
		try{Thread.sleep(500);} catch (Exception e) {} // to avoid both threads collision
		t2.start();
		}
}
