package com.capg.corejava.failfast.failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {

		// List<Integer> list = new ArrayList<>();
		List<Integer> list = new CopyOnWriteArrayList<>(); // adds new element to clone copy of actual list

		list.add(1);
		list.add(2);
		list.add(3);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

			list.add(4); // TRYING TO DO MODIFICATIONS AND ADD A NEW ELEMENT
			// Exception in thread "main" java.util.ConcurrentModificationException
			// HENCE USING CopyOnWriteArrayList

		}

	}

}
