package com.capg.corejava.stringsbuilder;

import java.util.Scanner;

public class RevereseString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello User Enter your input String :");

		// taking input from user in StringBuilder format

		StringBuilder sb = new StringBuilder(scanner.nextLine());

		for (int i = 0; i < sb.length() / 2; i++) {

			int frontIndex = i;
			int backIndex = sb.length() - 1 - i; // 5 - 1 - 0 => 4 for hello

			char frontChar = sb.charAt(frontIndex);
			char backChar = sb.charAt(backIndex);

			sb.setCharAt(frontIndex, backChar);
			sb.setCharAt(backIndex, frontChar);
		}

		System.out.println("Reversed Output String :" + sb);
	}

}
