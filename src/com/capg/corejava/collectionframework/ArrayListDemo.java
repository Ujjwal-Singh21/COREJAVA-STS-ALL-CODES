package com.capg.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

// WITH GENERICS
public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Amar");
		arraylist.add("Akbar");
		arraylist.add("Anthony");
		arraylist.add("Movie");

		// normal printing
		System.out.println(arraylist);

		// printing using iterator plus while loop
		Iterator i = arraylist.iterator();
		while (i.hasNext())

		{
			System.out.println(i.next());
		}

		// printing using for each loop best to use when generic is used
		for (String s : arraylist)
			System.out.println(s);
	}
}
