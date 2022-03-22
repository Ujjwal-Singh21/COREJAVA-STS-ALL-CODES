package com.capg.corejava.collectionframework;

import java.util.HashMap;
import java.util.Iterator;

// 1 null key allowed
// multiple null values allowed
// duplicate keys gets value re assigned
public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap mymap = new HashMap();
		mymap.put(7777, "Ujjwal address : Chennai");
		mymap.put(234, "Hello World");
		mymap.put(12, "Welcome");
		mymap.put(123, null);
		mymap.put(null, null);
//		mymap.put(null, "Hello");
		System.out.println(mymap);

	}

}
