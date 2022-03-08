package com.capg.corejava.javabeans;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

	private int eno;
	private String ename;
	private double sal;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

}
