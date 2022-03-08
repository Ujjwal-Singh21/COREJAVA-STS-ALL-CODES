package com.capg.corejava.collectionframework;

import java.util.ArrayList;

// WITH GENERICS PLUS ANOTHER WAY OF DECLARATION

import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Ujjwal");
		mylist.add("Rushil");
		mylist.add("Prem");
		mylist.add("Sanjeevi");
		System.out.println(mylist);
		
		// using iterator
		  Iterator i1 = mylist.iterator(); 
		  while (i1.hasNext()) //has next element? 
		  {
		  System.out.println(i1.next());
		   }
		 
		// for generics, for each advanced loop is best
		for (String i : mylist) 
		{
			System.out.println(i);
		}
	}
}
