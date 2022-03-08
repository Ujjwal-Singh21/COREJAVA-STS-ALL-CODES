package com.capg.corejava.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int marksList[] = { 10, 20, 30, 40, 50 }; // SYNTAX 2 TO DECLARE + INITIALISE ARRAY
		

		// TWO WAYS TO PRINT THEM

		// FIRST NORMAL WAY
		System.out.println("FIRST NORMAL WAY OF PRINTING");
		
		System.out.println(marksList[0]);
		System.out.println(marksList[1]);
		System.out.println(marksList[2]);
		System.out.println(marksList[3]);
		System.out.println(marksList[4]);
		
		System.out.println("SECOND WAY OF PRINTING USING FOR LOOP");

		// SECOND WAY USING FOR LOOP
		for (int i = 0; i <= marksList.length; i++)

			System.out.println(marksList[i]);

	}

}
