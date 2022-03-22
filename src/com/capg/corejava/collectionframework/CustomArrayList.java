package com.capg.corejava.collectionframework;

import java.util.ArrayList;

// LIST -> ARRAYLIST, ALLOWS DUPLICATES,
// BUT HERE CREATING A CUSTOM ARRAYLIST WHERE DUPLICATES ARE NOT ALLOWED
public class CustomArrayList extends ArrayList {

	// Own Check
	public boolean m1(Object s) {
		if (super.contains(s)) {
			System.out.println("Duplicate element");
		} else {
			System.out.println(s + " Added");
			return super.add(s);
		}
		return true;
	}

	@Override
	public boolean add(Object e) {
		if (this.contains(e)) {
			System.out.println("Element is already available");
			return false; // if already element is there then don't add it to list
		} else {
			System.out.println("Element " + e + " is added");
			return super.add(e); // if its not there then add the element
		}

	}

	public static void main(String[] args) {

		CustomArrayList customArrayList = new CustomArrayList();
		customArrayList.add(1);
		customArrayList.add(1);
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add("Tony Stark");

		// Own Check
		customArrayList.m1("Hello");
		customArrayList.m1("Hello");

		System.out.println("Final List: " + customArrayList);

	}

}
