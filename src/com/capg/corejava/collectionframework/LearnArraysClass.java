package com.capg.corejava.collectionframework;

import java.util.Arrays;

// The Arrays class in java.util package is a part of the Java Collection Framework.
// This class provides static methods to dynamically create and access Java arrays. 
// It consists of only static methods and the methods of Object class. 
// The methods of this class can be used by the class name itself.
public class LearnArraysClass {

	public static void main(String[] args) {

//		int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int index = Arrays.binarySearch(numbers1, 4);
//
//		System.out.println("The index of element 4 in the array is " + index);

		Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
		// Normal sort in ascending order
		// prints only hashcode after sorting
		// ----------------------------------------------
		/*
		 * Arrays.sort(numbers); System.out.println("After sort: " + numbers);
		 */

		// Parallel sort
		// prints only hashcode after sorting
		// ---------------------------------------------------
		Arrays.parallelSort(numbers);
		System.out.println("After parallelSort: " + numbers);

		// fills whole array with 12
//		Arrays.fill(numbers, 12);

		for (int i : numbers) {
			System.out.print(i + " ");
		}

	}
}
