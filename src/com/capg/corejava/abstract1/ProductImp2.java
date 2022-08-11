package com.capg.corejava.abstract1;

abstract class Product2 {

	// this constructor executed first
	Product2() {
		System.out.println("abstract class constructor");
	}

	// abstract method
	public abstract void newProduct();

	// concrete method
	public void allproducts() {
		System.out.println("all products");
	}
}

public class ProductImp2 extends Product2 {

	// this constructor executed second
	ProductImp2() {
		System.out.println("implementation class constructor");
	}

	// overridden abstract class method
	@Override
	public void newProduct() {
		System.out.println("my new products");
	}

	// local method
	public void display() {
		System.out.println("LOCAL METHOD display");
	}

	public static void main(String[] args) {

		// object creation
		ProductImp2 productimp2 = new ProductImp2();
		productimp2.newProduct();
		productimp2.allproducts();
		productimp2.display();

		// reference creation
		Product2 product2 = new ProductImp2();
		product2.newProduct();
		product2.allproducts();

	}
}
