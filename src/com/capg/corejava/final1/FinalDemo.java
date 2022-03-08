package com.capg.corejava.final1;

public class FinalDemo {

	final String countryName = "India";
	String cityName = "Bengaluru";

	public void display() {
		// cannot assign new name to countryname bcoz it is final
		// countryname = "Bharat";
		System.out.println("COUNTRY NAME :" + countryName);

	}

	public void show() {
		System.out.println("CITY NAME :" + cityName);
	}

	public static void main(String[] args) {

		FinalDemo fd1 = new FinalDemo();
		fd1.display();
		fd1.show();

	}

}
