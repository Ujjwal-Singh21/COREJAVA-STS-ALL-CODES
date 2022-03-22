package com.capg.corejava.comparable;

// getters not required because we are directly accessing variables while
// compariosn instead of
// getting it through getter methods.
// seters are not required because we are not updating or setting any variable's
// value.
// if (this.getEmployeeId() > employee2.getEmployeeId()) -> requires getters -> without gettor ->
//--------------------------------------------------------------------------------------------------------------
public class Employee implements Comparable<Employee> {

	public int employeeId;
	public String employeeName;
	public double salaryOfEmployee;

	public Employee(int employeeId, String employeeName, double salaryOfEmployee) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salaryOfEmployee = salaryOfEmployee;

	}

	// SORTING BASED ON ID
	// ----------------------
	@Override
	public int compareTo(Employee employee2) {
		
		if (this.employeeId > employee2.employeeId) {
			return 1;
		} else {
			return -1;
		}

	}

	// SORTING BASED ON SALARY
	// ---------------------------
//	@Override
//	public int compareTo(Employee employee2) {
//		
//		if (this.salaryOfEmployee > employee2.salaryOfEmployee) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

	// SORTING BASED ON NAME
	// ------------------------
	// compareTo() method by default sorts Strings in alphabetical order, hence
	// simply calling this method and work
	// is done for sorting based on Names.
	// -----------------------------------------------------------------------------------------------------------------
//	@Override
//	public int compareTo(Employee employee2) {
//
//		return this.employeeName.compareTo(employee2.employeeName);
//	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salaryOfEmployee="
				+ salaryOfEmployee + "]";
	}
}
