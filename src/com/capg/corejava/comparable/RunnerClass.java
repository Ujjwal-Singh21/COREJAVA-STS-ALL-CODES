package com.capg.corejava.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerClass {

	public static void main(String[] args) {
		
		List<Laptop> lap = new ArrayList<>();
		lap.add(new Laptop("Dell", 16, 800));
		lap.add(new Laptop("Apple", 8, 18000));
		lap.add(new Laptop("Acer", 12, 500));
		
		Collections.sort(lap);
		
		for(Laptop l : lap)
		{
			System.out.println(l);
		}
		
		
		

	}

}
