package com.capg.corejava.comparator;

// Use comparator if u want to perform sorting on your own logic and parameters
//-----------------------------------------------------------------------------
public class SmartPhone {

	private int ram;
	private String model;
	private double price;

	public SmartPhone(int ram, String model, double price) {
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SmartPhone [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}
}
