package com.capg.corejava.comparable;

public class Employee implements Comparable<Employee> {

	public int employeeId;
	public String employeeName;
	public double salaryOfEmployee;

	public Employee(int employeeId, String employeeName, double salaryOfEmployee) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salaryOfEmployee = salaryOfEmployee;

	}

	// GETTERS METHOD
	private int getEmployeeId() {

		return employeeId;
	}

	private String getEmployeeName() {

		return employeeName;
	}

	private double getSalaryOfEmployee() {

		return salaryOfEmployee;
	}

	// SETTERS METHOD NOT IMPORTANT HERE FOR THIS PROGRAM FOR COMPARETO METHOD
//	private void setEmployeeId(int employeeId) {
//
//		this.employeeId = employeeId;
//	}
//
//	private void setEmployeeName(String employeeName) {
//
//		this.employeeId = employeeId;
//	}
//
//	private void getSalaryOfEmployee(double salaryOfEmployee) {
//
//		this.employeeId = employeeId;
//	}

	// SORTING BASED ON ID
	@Override
	public int compareTo(Employee employee2) {

		if (this.getEmployeeId() > employee2.getEmployeeId()) {
			return 1;
		} else {
			return -1;
		}
	}

//	// SORTING BASED ON SALARY
//	@Override
//	public int compareTo(Employee employee2) {
//
//		if (this.getSalaryOfEmployee() > employee2.getSalaryOfEmployee()) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

//	// SORTING BASED ON NAME
//	@Override
//	public int compareTo(Employee employee2) {
//
//		if (this.getEmployeeName().equals(employee2.getEmployeeName())) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salaryOfEmployee="
				+ salaryOfEmployee + "]";
	}
}
