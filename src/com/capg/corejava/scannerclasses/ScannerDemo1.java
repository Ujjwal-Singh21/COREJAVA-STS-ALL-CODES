package com.capg.corejava.scannerclasses;
import java.util.Scanner;

// sc.nextInt()      - reads an integer value from user.
// sc.nextFloat()    - reads an float value from user.
// sc.nextBoolean()  - reads an boolean value from user.
// sc.nextLine()     - reads a line of text or string value from user.
// System.in         - standard input keyword for scanner class in java.
//----------------------------------------------------------------------
public class ScannerDemo1 {

	public static void main(String[] args) {

		// creating object of scanner class
		Scanner scanner = new Scanner(System.in);

		System.out.println("ENTER EMPLOYEE ID");
		int eid = scanner.nextInt();
	
		System.out.println("ENTER EMPLOYEE NAME");
		String ename = scanner.next();

		System.out.println("ENTER EMPLOYEE SALARY");
		double esal = scanner.nextDouble();

		System.out.println("ENTER EMPLOYEE HOBBY");
		String hobby = scanner.next();

		System.out.println("EMPLOYEE ID: " + eid);
		System.out.println("EMPLOYEE NAME :" + ename);
		System.out.println("EMPLOYEE SALARY: " + esal);
		System.out.println("EMPLOYEE HOBBY: " + hobby);
	}
}
