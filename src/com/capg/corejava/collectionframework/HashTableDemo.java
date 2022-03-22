package com.capg.corejava.collectionframework;

import java.util.Hashtable;

//null keys and values both not allowed
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable mymap = new Hashtable();
		
		mymap.put(7777, "Pranav add : Chennai");
		mymap.put(234, "Hello World");
		mymap.put(12, "Welcome");
		mymap.put(123, "null");
//		mymap.put(null, "null"); -> Not allowed
		
		System.out.println(mymap);
	}

}
