package com.capg.corejava.abstract1;

// Performing initialization to instance variables of abstract class using the value passed by user, 
// While object reference creation.
//--------------------------------------------------------------------------------------------------
abstract class Product4 {

	int id;
	String name;

	Product4() {
		System.out.println("abstract class no-arg constructor");
	}

	// with-arg constructor
    //-----------------------
	Product4(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("abstract class with-arg constructor");
	}

	// abstract method
	public abstract void newProduct();

	// concrete method
	public void allproducts() {
		System.out.println("all products");
		System.out.println("productId: " + id + " productName: " + name);
	}
}

public class ProductImp4 extends Product4 {

	ProductImp4() {
		System.out.println("implementation class no-arg constructor");
	}

	// with-arg constructor
	//-----------------------
	ProductImp4(int id, String name) {
		super(id, name);
		System.out.println("implementation class with-arg constructor");
	}

	// Overridden abstract method
	@Override
	public void newProduct() {
		System.out.println("my new products");
	}

	// local method.
	public void display() {
		
		System.out.println("LOCAL METHOD display");
		
		// here both lines prints same output because,
		//================================================
		// line1 -> normally access instance variables of parent Class because of inheritence concept.
		// line2-> accesss parent class instance variables directly using super keyword.
		//----------------------------------------------------------------------------------
		System.out.println("displayId: " + id + " displayName :" + name);
		System.out.println("displayId: " + super.id + " displayName :" + super.name);
	}

	public static void main(String[] args) {

		// object creation
		//------------------
		ProductImp4 productimp = new ProductImp4();
		ProductImp4 productimp4 = new ProductImp4(102, "Virat");
		
		productimp4.newProduct();
		productimp4.allproducts();
		productimp4.display();

		// reference creation
		//-----------------------
		// setting values to abstract class instance variables by calling super() method inside Child class 
		// with-arg constructor and passing the values to abstract class arg constructor.
		//-----------------------------------------------------------------------------------------------------
		Product4 product4 = new ProductImp4(101, "Dhoni");
		System.out.println("Id value: " + product4.id + " & Name Value: " + product4.name);
		product4.newProduct();
		product4.allproducts();

	}
}
