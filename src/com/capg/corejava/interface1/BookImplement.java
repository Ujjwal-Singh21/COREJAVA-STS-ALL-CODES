package com.capg.corejava.interface1;

interface Book {
	
	public static final String username = "Ujjwal";
	
	public void booktitle();
	public void bookAuthor();
	public void bookPrice();
}

public class BookImplement implements Book {

	public void booktitle() {
		System.out.println("INCEPTION");
	}

	public void bookAuthor() {
		System.out.println("CHRISTOPHER NOLAN");
	}

	public void bookPrice() {
		System.out.println(1000);
	}

	public static void main(String[] args) {

		BookImplement bookImplement = new BookImplement();
		bookImplement.booktitle();
		bookImplement.bookAuthor();
		bookImplement.bookPrice();
	}

}
