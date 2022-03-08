package com.corejava.general;

@FunctionalInterface
interface MaxFinder {
	public int Maximum(int num1, int num2);
}

public class MaxFinderImpl {

	public static void main(String[] args) {
		MaxFinder finder = (num1, num2) -> num1 > num2 ? num1 : num2;
		int result = finder.Maximum(33, 333);
		System.out.println("Maximum of both is : " + result);
	}

}
