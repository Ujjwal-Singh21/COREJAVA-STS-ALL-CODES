package com.capg.corejava.exceptionhandling;

// 1) Without using throws keyword
class NoWifiException extends Exception {
	NoWifiException(String message) {
		System.err.println("INVALID PINCODE :" + message);
	}
}

public class MyExceptionDemo1 {

//	int pincode = 60044; // No exception -> else block executes
	int pincode = 604;  // Throws exception -> if block executes 
	String str = Integer.toString(pincode);

	// method level exception handling 
	// without using throws keyword
	public void display() {
		try {
			if (str.length() <= 4)
				throw new NoWifiException(" Service not available in your city ");
			else
				System.out.println(" Service available and will be installed soon");
		}

		catch (Exception e1) {
			System.out.println("I can handle :" + e1);
		}
	}

	public static void main(String[] args) {

		MyExceptionDemo1 myExceptionDemo1 = new MyExceptionDemo1();
		myExceptionDemo1.display();

	}

}
