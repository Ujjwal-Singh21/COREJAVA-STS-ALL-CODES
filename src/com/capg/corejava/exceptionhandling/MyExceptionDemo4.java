package com.capg.corejava.exceptionhandling;

// Again Without using throws keyword
class NoWifiException3 extends Exception {
	NoWifiException3(String message) {
		System.err.println("INVALID City NAME:" + message);
	}
}

public class MyExceptionDemo4 {

	String city = "Bengaluru";

	public void display() {
		try {

			if (city.equals("Chennai") || city.equals("Delhi") || city.equals("Mumbai") || city.equals("Kolkata"))
				System.out.println(" Service available and will be installed soon");

			else
				throw new NoWifiException3(" Service not available in your city ");
		}

		catch (Exception e1) {
			System.out.println(e1);
		}

	}

	public static void main(String[] args) {
		MyExceptionDemo4 ude = new MyExceptionDemo4();
		ude.display();

	}

}
