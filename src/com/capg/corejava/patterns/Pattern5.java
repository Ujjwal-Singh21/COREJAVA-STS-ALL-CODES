package com.capg.corejava.patterns;

public class Pattern5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			int k = i;

			for (int j = 1; j <= 4; j++) {
				if (k <= 4)
					System.out.print(k);
				else if (k > 4) {
					k = 1;
					System.out.print(k);

				}
				k++;

			}

			System.out.println("");
		}

	}

}
