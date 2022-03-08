package com.capg.corejava.comparator;

// use comparator if u want to perform sorting on your own logic and parameters


public class Television // if class does not implement comparable interface
{
	
	private String name;
	private int price;
	private int type;
	
	
	public Television(String name, int price, int type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	

	@Override
	public String toString() {
		return "Television [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}
