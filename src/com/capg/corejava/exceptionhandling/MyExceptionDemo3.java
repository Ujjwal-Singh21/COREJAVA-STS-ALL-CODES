package com.capg.corejava.exceptionhandling;

// 3) using throws keyword
class NoWifiException2 extends Exception {
	NoWifiException2(String message) {

		System.err.println("INVALID PINCODE:" + message);
	}
}

public class MyExceptionDemo3 {

	int pincode = 600445;
	String str = Integer.toString(pincode);

	public void display() throws NoWifiException2 {

		if (str.length() == 6)
			System.out.println(" Service available and will be installed soon");

		else
			throw new NoWifiException2(" Service not available in your city ");

	}

	// exception handling in main method
	public static void main(String[] args) {
		try {
			MyExceptionDemo3 ude = new MyExceptionDemo3();
			ude.display();
		}

		catch (Exception e1) {
			System.out.println("I can handle :" + e1);
		}

	}

}
