package com.capg.corejava.constructors;

// A copy constructor is a member function that initializes an object using another object of the same class. 
// In simple terms, a constructor which creates an object by initializing it with an object of the same class, which has been
// created previously is known as a copy constructor.
public class Fruit {

	private double fruitPrice;
	private String fruitName;

	// normal with-arg Constructor
	Fruit(double fruitPrice, String fruitName) {
		this.fruitPrice = fruitPrice;
		this.fruitName = fruitName;
	}

	// copy Constructor
	Fruit(Fruit fruit) {
		System.out.println("Invoking Copy Constructor");
		fruitPrice = fruit.fruitPrice;
		fruitName = fruit.fruitName;
	}

	// getters
	public String showName() {
		return fruitName;
	}
	
	public double showPrice() {
		return fruitPrice;
	}

	public static void main(String[] args) {

		Fruit fruit1 = new Fruit(399, "Apple & Banana");
		System.out.println("FruitName 1: " + fruit1.showName());
		System.out.println("FruitPrice 1: " + fruit1.showPrice());

		// Passing this object as parameter to copy Cosntructor
		Fruit fruit2 = new Fruit(fruit1);
		System.out.println("FruitName 2: " + fruit2.showName());
		System.out.println("FruitPrice 2: " + fruit2.showPrice());

	}

}
