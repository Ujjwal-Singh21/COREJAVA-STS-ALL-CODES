package com.capg.corejava.collectionframework;

import java.util.ArrayList;

// WITHOUT GENERICS
import java.util.Iterator;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		mylist.add(10);
		mylist.add(10);
		mylist.add(45.5);
		mylist.add("Ujjwal");
		mylist.add(10);
		System.out.println(mylist);
		
		//USING ITERATOR 
		Iterator i1 = mylist.iterator();
		while (i1.hasNext()) //has next element?
		{
			System.out.println(i1.next());
		}
	}

}

