package com.capg.corejava.interface1;

interface Book2 {
	public void booktitle();

	public void bookAuthor();

	public void bookPrice();
}

public class BookImplement2 implements Book2 {

	public void booktitle() {
		System.out.println("INCEPTION");

	}

	public void bookAuthor() {
		System.out.println("CHRISTOPHER NOLAN");

	}

	public void bookPrice() {
		System.out.println(1000);

	}

	// local method of class
	public void mydisplay() {
		System.out.println("mydisplay is local method");

	}

	public static void main(String[] args) {

		BookImplement2 bookImplement2 = new BookImplement2();
		bookImplement2.booktitle();
		bookImplement2.bookAuthor();
		bookImplement2.bookPrice();

		// Book2 book2 = new Book2(); Cannot instantiate the type Book2, hence object can't be created.

		Book2 book2 = new BookImplement2();
		book2.bookAuthor();
		book2.booktitle();
		book2.bookPrice();
		// book2.mydisplay();
		// The method mydisplay() is undefined for the type Book2.

	}

}
