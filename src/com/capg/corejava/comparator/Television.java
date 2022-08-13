package com.capg.corejava.comparator;

// use comparator if u want to perform sorting on your own logic and parameters (Customized sorting).
// or if class does not implement comparable interface.
//---------------------------------------------------------------------------------------------------
public class Television {

	private String name;
	private int price;
	private int type;

	public Television(String name, int price, int type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Television [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
}
