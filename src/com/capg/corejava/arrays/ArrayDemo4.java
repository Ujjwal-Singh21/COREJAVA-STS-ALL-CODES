package com.capg.corejava.arrays;

import java.util.Scanner;

// TAKING SIZE OF ARRAY FROM USER, ALSO TAKING INPUT VALUES FROM USER , 
// SEARCHING FOR A GIVEN NUMBER X IN ARRAY AND PRINTINF INDEX AT WHICH IT OCCURS

public class ArrayDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int numbers[] = new int[size];

		System.out.println("Enter elements to be stored : ");

		// INPUT
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();

		}

		// Taking X element to search
		System.out.println("Enter X value to be searched : ");

		int x = sc.nextInt();
		for (int i = 0; i < size; i++) {

			if (x == numbers[i])
				System.out.println("x found at Index no :" + i);

		}

	}

}
