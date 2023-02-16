package com.capg.corejava.arrays;

import java.util.Scanner;

// TAKING SIZE OF ARRAY FROM USER, ALSO TAKING INPUT VALUES FROM USER ,THEN PRINTING IT FINALLY
public class ArrayDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int numbers[] = new int[size];

		System.out.println("Enter elements to be stored : ");

		// Taking input numbers one by one and storing in array with ArrayName "numbers"
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		// displaying output
		System.out.println("The Array you made looks like this : ");
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);

		}

	}

}
