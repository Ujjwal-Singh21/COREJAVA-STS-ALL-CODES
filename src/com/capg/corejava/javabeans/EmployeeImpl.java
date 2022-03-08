package com.capg.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {

		// USING SETTER METHOD TO SET VALUES
		EmployeeBean empBean = new EmployeeBean();
		empBean.setEno(100);
		empBean.setEname("Ujjwal");
		empBean.setSal(55000);

		System.out.println("Employee No : " + empBean.getEno());
		System.out.println("Employee Name : " + empBean.getEname());
		System.out.println("Employee Salary : " + empBean.getSal());
	}

}
