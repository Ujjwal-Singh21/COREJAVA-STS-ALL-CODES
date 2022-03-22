package com.capg.corejava.comparable;

public class Laptop implements Comparable<Laptop> {

	private String brand;
	private int ram;
	private int price;

	public Laptop(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	// Only getters
	public String getBrand() {
		return brand;
	}

	public int getRam() {
		return ram;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop lap2) {

		// this > lap2 = + (swap), -> After
		// this < lap2 = - (no swap) -> before
		// this = lap2 = 0

		// if (this.getPrice() > lap2.getPrice()) or
		if (this.price > lap2.price)
			return 1;

		else
			return -1;
	}

}
