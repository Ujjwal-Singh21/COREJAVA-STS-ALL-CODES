package com.capg.corejava.abstract1;

//Error: The type Product must be an abstract class to define abstract methods -> (if abstract keyword is removed)
abstract class Product {

	// variables can be both static or non-static
	public static String name = "Ujjwal";
	public String Country = "India";

	// abstract method
	public abstract void newProduct();

	// concrete method
	public void allproducts() {
		System.out.println("all products");
	}
}

public class ProductImp1 extends Product {

	// overridden abstract class method
	@Override
	public void newProduct() {
		System.out.println("my new products");
	}

	// local method
	public void display() {
		System.out.println("LOCAL METHOD");
	}

	public static void main(String[] args) {

		// object creation
		ProductImp1 productimp1 = new ProductImp1();
		productimp1.newProduct();
		productimp1.allproducts();
		productimp1.display();

		// reference creation -> Parent reference holding child Object
		Product product = new ProductImp1();
		product.newProduct();
		product.allproducts();
//		product.display(); // -> The method display() is undefined for the type Product
		System.out.println("Non-Static variable: " + product.Country);

	}
}
