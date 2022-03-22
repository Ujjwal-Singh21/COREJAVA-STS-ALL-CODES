package com.capg.corejava.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> mymap = new HashMap<Integer, String>();
		
		mymap.put(7777, "Pranav Chennai");
		mymap.put(234, "Hello World");
		mymap.put(12, "Welcome");
		mymap.put(123, null);
		mymap.put(234, "Hello World");

//		System.out.println(mymap);

		for (Map.Entry<Integer, String> m : mymap.entrySet())
//			System.out.println(m);
		 System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
				
	}

}
