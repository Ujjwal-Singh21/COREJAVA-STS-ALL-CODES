package com.capg.corejava.collectionframework;

import java.util.ArrayList;

// LIST ALLOWS DUPLICATES,
// BUT HERE CREATING A CUSTOM ARRAYLIST WHERE DUPLICATES ARE NOT ALLOWED
public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object e) {
		if (this.contains(e)) {
			System.out.println("Element is already available");
			return true; // if already element is there then don't add it to list
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

		System.out.println("Final List: " + customArrayList);

	}

}
