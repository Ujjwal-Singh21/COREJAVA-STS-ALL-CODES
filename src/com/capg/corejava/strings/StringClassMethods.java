package com.capg.corejava.strings;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String countryName = "     India";
		String userName = "Steve";
		
		System.out.println(countryName.length());
		System.out.println(countryName.toUpperCase());
		System.out.println(countryName.toLowerCase());
		System.out.println(countryName.trim());
		System.out.println(countryName.concat(" Hindustan"));
		System.out.println(countryName.compareTo("india"));
		System.out.println(countryName.isEmpty());
		
		System.out.println(userName.startsWith("S"));
		System.out.println(userName.endsWith("e"));
		

	}

}
