package com.capg.corejava.javaVariables;

public class JavaVariables {

	// Global/Instance Variables
	int id;
	String name;

	// Default constructor
	JavaVariables() {
		super();
	}

	// Parameterized constructor
	JavaVariables(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Static Variables with initial values given by JVM
	static int employeeId;
	static String employeeName;

	// Static Variables with initial values given by User
	static int employeeId1 = 11;
	static String employeeName1 = "Employee One";

	// Local Variables inside a method block
	public void myMethod() {
		int localId = 9000;
		String localName = "Steve";
		System.out.println("Local ID: " + localId + " LocalName: " + localName);
	}

	public static void main(String[] args) {

		// object-1 for Global Variables 1st copy
		// ---------------------------------------
//      JavaVariables javaVariables = new JavaVariables();
		JavaVariables javaVariables = new JavaVariables(45, "Rohit");
		int globalId = javaVariables.id;
		String globalName = javaVariables.name;
		System.out.println("Global ID1: " + globalId + " GlobalName1: " + globalName);

		// object-2 for Global Variables 2nd copy
		// ---------------------------------------
		JavaVariables javaVariables2 = new JavaVariables(18, "Virat");
		int globalId2 = javaVariables2.id;
		String globalName2 = javaVariables2.name;
		System.out.println("Global ID2: " + globalId2 + " GlobalName2: " + globalName2);

		// object-3 for Local variables inside a method block
		// ---------------------------------------------------
		JavaVariables javaVariables1 = new JavaVariables();
		javaVariables1.myMethod();

		// Static Variables Default value by JVM
		// --------------------------------------
		int EmployeeID = JavaVariables.employeeId;
		String EmployeeName = JavaVariables.employeeName;
		System.out.println("Static variables Default value by JVM: " + EmployeeID + " " + EmployeeName);

		// Static Variables Default value by User
		// ---------------------------------------
		int EmployeeID1 = JavaVariables.employeeId1;
		String EmployeeName1 = JavaVariables.employeeName1;
		System.out.println("Static variables Default value by User: " + EmployeeID1 + " " + EmployeeName1);
	}
}
