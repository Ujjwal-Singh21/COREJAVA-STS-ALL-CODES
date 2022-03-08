package com.capg.corejava.scannerclasses;

// sc.nextInt      - reads an integer value from user.
// sc.nextFloat    - reads an float value from user.
// sc.nextBoolean  - reads an boolean value from user.
// sc.nextLine     - reads a line of text or string value from user.
// System.in       - standard input keyword for scanner class in java.

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {

		// creating object of scanner class
		Scanner sc = new Scanner(System.in); 

		System.out.println("ENTER EMPLOYEE ID");
		int eid = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE NAME");
		String ename = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE SALARY");
		double esal = sc2.nextDouble();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE HOBBY");
		String hobby = sc3.nextLine();

		System.out.println("EMPLOYEE ID: " + eid);
		System.out.println("EMPLOYEE NAME :" + ename);
		System.out.println("EMPLOYEE SALARY: " + esal);
		System.out.println("EMPLOYEE HOBBY: " + hobby);

	}

}
