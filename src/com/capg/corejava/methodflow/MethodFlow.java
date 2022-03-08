package com.capg.corejava.methodflow;

public class MethodFlow {

	// (1) no parameter no return type
	public void myname() {
		System.out.println("Ujjwal");
	}

	// (2) Parameter with no return type
	public void myvalues(int a, int b) {
		System.out.println("A Value :" + a);
		System.out.println("B Value :" + b);

	}

	// (3) Parameter with return type
	public int add(int x, int y) {
		return x + y;
	}

	// (4) no parameter with return type
	public int myprint() {
		int a = 100;
		return a;
	}

	public static void main(String[] args) {

		MethodFlow flow = new MethodFlow();
		flow.myname();

		MethodFlow flow1 = new MethodFlow();
		flow1.myvalues(10, 20);

		MethodFlow flow2 = new MethodFlow();
		int t = flow2.add(33, 33);
		System.out.println("t value :" + t);

		MethodFlow flow3 = new MethodFlow();
		int k = flow3.myprint();
		// System.out.println("K value :"+k);
		System.out.println(flow3.myprint());

	}

}
