package com.capg.corejava.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopRunnerClass {

	public static void main(String[] args) {

		List<Laptop> laptopList = new ArrayList<>();
		
		laptopList.add(new Laptop("Dell", 16, 800));
		laptopList.add(new Laptop("Apple", 8, 18000));
		laptopList.add(new Laptop("Acer", 12, 500));
		
		Collections.sort(laptopList);

		for (Laptop l : laptopList) {
			System.out.println(l);
		}
	}
}
