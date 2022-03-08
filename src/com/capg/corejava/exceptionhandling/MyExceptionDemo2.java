package com.capg.corejava.exceptionhandling;

// 2) using throws keyword
class NoWifiException1 extends Exception {
	NoWifiException1(String message) {

		System.err.println("INVALID PINCODE :" + message);
	}
}

public class MyExceptionDemo2 {

//	int pincode = 60044; // No exception -> else block executes
	int pincode = 604; // Throws exception -> if block executes
	String str = Integer.toString(pincode);

	public void display() throws NoWifiException1 {

		if (str.length() <= 4)
			throw new NoWifiException1(" Service not available in your city ");
		else
			System.out.println(" Service available and will be installed soon");
	}

	// exception handling in main method
	public static void main(String[] args) {
		try {
			MyExceptionDemo2 myExceptionDemo2 = new MyExceptionDemo2();
			myExceptionDemo2.display();
		} catch (Exception e1) {
			System.out.println("I can handle :" + e1);
		}

	}

}
