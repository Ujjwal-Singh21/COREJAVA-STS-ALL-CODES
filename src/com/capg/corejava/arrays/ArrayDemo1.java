package com.capg.corejava.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int marks[] = new int[5]; // SYNTAX 1 TO DECLARE ARRAY

		marks[0] = 55;
		marks[1] = 65;
		marks[2] = 75;
		marks[3] = 85;
		marks[4] = 95;

		// TWO WAYS TO PRINT THEM

		// FIRST NORMAL WAY
		System.out.println("FIRST NORMAL WAY OF PRINTING");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		System.out.println("SECOND WAY OF PRINTING USING FOR LOOP");

		// SECOND WAY USING FOR LOOP
		for (int i = 0; i < marks.length; i++)

			System.out.println(marks[i]);

		for (int t : marks)
			System.out.println(" for each loop " + t);
	}

}
