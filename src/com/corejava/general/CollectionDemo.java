package com.corejava.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//list.add("ujjwal");
		//list.add("Rajkumar");
		list.add(10);
		list.add(15);
		list.add(88);
		list.add(33);
		list.add(56);
		list.add(67);
		
	   Comparator com = new Comimpl();
		
		
		Collections.sort(list,com);    //method to sort elememt
		
		//Collections.reverse(list);
		
		//list.forEach(System.out::println); // method 1 to print 
		
	
		  Iterator i = list.iterator(); //  method 2 to print
		  while(i.hasNext())
		  {
		  System.out.println(i.next()); 
		  }
		 
		 
		/*
		 * for(int j: list) // method 3 to print { System.out.println(j); }
		 */
		
	}

}
