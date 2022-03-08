package com.capg.corejava.collectionframework;

import java.util.HashSet;

public class HashsetDemo1 {

	public static void main(String[] args) {
		
		HashSet hashset = new HashSet();
		hashset.add(100);
		hashset.add("Ramesh");
		hashset.add(45.5);
		hashset.add(5.5f);
		hashset.add(10);
		
		//normal method to print
		System.out.println(hashset);
		
		
		//method 1 to print using for each advance loop
		
		for(Object i : hashset)
			{
			System.out.println(i);
		    }
		
		// method 2 to print using advance for each plus lambda expression
		
		hashset.forEach(System.out::println);

	}

}
