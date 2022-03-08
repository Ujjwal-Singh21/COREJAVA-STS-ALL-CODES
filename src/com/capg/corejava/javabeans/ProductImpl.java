package com.capg.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {

		ProductBean product = new ProductBean(100, "iPhone 12", 150000);
		System.out.println("Product no : " + product.getPno());
		System.out.println("Product name : " + product.getPname());
		System.out.println("Product Price : " + product.getPrice());

	}

}
