package com.capg.corejava.comparator;

public class SmartPhone {

	private int ram;
	private String model;
	private double price;

	public SmartPhone(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;

	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SmartPhone [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}

}
