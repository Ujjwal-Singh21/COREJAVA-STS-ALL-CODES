package com.capg.corejava.abstract1;

// Constructor in abstract class is used to initialize the Instance/Global variables available.
// So when Object reference is created for Abstract class using Implementation/child class constructor,
// Abstract class constructor gets called 1st, then it initializes the instance variables to default value,
// after that child/implementation class constructor gets executed.
//----------------------------------------------------------------------------------------------------------------
abstract class Product3 {

	int id;
	String name;

	// this constructor executed first
	//-----------------------------------
	Product3() {
		System.out.println("abstract class constructor");
	}

	// abstract method
	//------------------
	public abstract void newProduct();

	// concrete method
	//------------------
	public void allproducts() {
		System.out.println("all products");
	}
}

public class ProductImp3 extends Product3 {

	// this constructor executed second.
	//------------------------------------
	ProductImp3() {
		System.out.println("implementation class constructor");
	}

	// overridden abstract method is changed to non-abstract method by providing implementation.
	//-------------------------------------------------------------------------------------------
	@Override
	public void newProduct() {
		System.out.println("my new products");
	}

	// non-abstract method is changed to abstract method.
	// To do this, now this child class should also be declared as abstract class.
	// If done so, then implementation class of this abstract class will be responsible to provide implementation to this 
	// abstract method.
	//---------------------------------------------------------------------------------------------------------------------
//	public abstract void allproducts();

	// local method.
	//----------------
	public void display() {
		System.out.println("LOCAL METHOD display");
	}

	public static void main(String[] args) {

		// object creation
		//------------------
		ProductImp3 productimp3 = new ProductImp3();
		productimp3.newProduct();
		productimp3.allproducts();
		productimp3.display();

		// reference creation
		//---------------------
		Product3 product3 = new ProductImp3();
		System.out.println("Id value: " + product3.id + " & Name: " + product3.name);
		product3.newProduct();
		product3.allproducts();

	}
}
