package com.capg.corejava.collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet myset = new TreeSet();
		myset.add(100);
		myset.add(10);
		
		// already Integer objects entered, entering String,double objects will make it
		// heterogeneous which is not
		// allowed, hence ClassCastException is thrown.
		//-------------------------------------------------------------------------------------
//		myset.add("Pranav");
//		myset.add(45.5);
//		myset.add(5.5f);	
		System.out.println(myset);
	}

}
