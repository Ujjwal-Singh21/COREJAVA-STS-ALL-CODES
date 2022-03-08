package com.capg.corejava.arrays;

import java.util.Scanner;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int[][] numbers = new int[rows][cols];

		// INPUT
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				numbers[i][j] = sc.nextInt();
			}

		}

		int x = sc.nextInt();

		// OUTPUT
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (numbers[i][j] == x)
					System.out.print("X found at location :(" + i + " , " + j + ")");
			}

		}

	}

}
