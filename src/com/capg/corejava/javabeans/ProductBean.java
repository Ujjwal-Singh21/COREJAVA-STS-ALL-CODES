package com.capg.corejava.javabeans;

public class ProductBean {

	private int pno;
	private String pname;
	private double price;

	public int getPno() {
		return pno;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

	// USING PARAMETERIZED CONSTRUCTOR TO SET VALUES
	ProductBean(int pno, String pname, double price) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
}
