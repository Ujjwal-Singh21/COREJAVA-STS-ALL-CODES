package com.corejava.general;

import java.util.Scanner;

public class Solution {

	public static int numSpecial(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			String temp = Integer.toString(arr[i]);
			int[] newarray = new int[temp.length()];

			for (int j = 0; j < temp.length(); j++) {
				newarray[j] = temp.charAt(j) - '0';

			}

			for (int k = 0; k < temp.length(); k++) {
				if (newarray[k] > newarray[k + 1]) {
					if (newarray[k + 1] > newarray[k + 2]) {
						if (newarray[k] > newarray[k + 2]) {
							count = count + 1;
						}
					}
				}

				break;
			}

		}
		return count;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int array_length;
		array_length = scan.nextInt();

		int[] arr = new int[array_length];

		for (int j = 0; j < array_length; j++) {
			arr[j] = scan.nextInt();
		}

		int result;
		result = numSpecial(arr);
		System.out.println(result);
		return;

	}

}
