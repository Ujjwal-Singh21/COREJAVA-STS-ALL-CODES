package com.capg.corejava.arrays;

import java.util.Scanner;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of columbs");
		int cols = sc.nextInt();

		// creating 2-d array based on rows and columns size entered
		int[][] numbers = new int[rows][cols];

		// INPUT
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				numbers[i][j] = sc.nextInt();
			}

		}

		// OUTPUT
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}

	}

}
