package com.capg.corejava.interface1;

interface NewBook {
	public void newbooktitle();

	public void newbookAuthor();

	public void newbookPrice();
}

interface Book3 extends NewBook {
	public void booktitle();

	public void bookAuthor();

	public void bookPrice();
}

public class BookImplement3 implements Book3, NewBook {

	public void booktitle() {
		System.out.println("INCEPTION");

	}

	public void bookAuthor() {
		System.out.println("CHRISTOPHER NOLAN");

	}

	public void bookPrice() {
		System.out.println(1000);

	}

	@Override
	public void newbooktitle() {
		System.out.println("THE PRESTIGE");

	}

	@Override
	public void newbookAuthor() {
		System.out.println("CHRISTIAN BALE");

	}

	@Override
	public void newbookPrice() {
		System.out.println(2000);
	}

	// local method of class
	public void mydisplay() {
		System.out.println("mydisplay() is local method");

	}

	public static void main(String[] args) {

		BookImplement3 bookImplement3 = new BookImplement3();
		bookImplement3.booktitle();
		bookImplement3.bookAuthor();
		bookImplement3.bookPrice();
		bookImplement3.newbooktitle();
		bookImplement3.newbookAuthor();
		bookImplement3.newbookPrice();

		// reference for Book3 interface to access only interface methods
		Book3 book3 = new BookImplement3();
		book3.booktitle();
		book3.bookAuthor();
		book3.bookPrice();

		// reference for NewBook interface to access only interface methods
		NewBook newbook = new BookImplement3();
		newbook.newbooktitle();
		newbook.newbookAuthor();
		newbook.newbookPrice();

	}
}
