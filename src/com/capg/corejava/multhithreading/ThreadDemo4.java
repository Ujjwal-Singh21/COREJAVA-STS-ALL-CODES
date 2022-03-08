package com.capg.corejava.multhithreading;

// by implementing runnable interface and lambda expression , anonymous class

public class ThreadDemo4 {

	public static void main(String[] args) {

		Runnable obj1 = () ->
		{
				for (int i = 0; i <= 5; i++) {
					System.out.println("Hi");
					try {Thread.sleep(500);} catch (Exception e) {} // to make delay in printing
				}
			}
			
		;
	
		Runnable obj2 = () ->
		{
				for (int i = 0; i <= 5; i++) {
					System.out.println("Hello");
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}
			
		;

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try{Thread.sleep(500);} catch (Exception e) {} // to avoid both threads collison
		t2.start();
		}
}
