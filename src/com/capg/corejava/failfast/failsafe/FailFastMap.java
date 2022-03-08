package com.capg.corejava.failfast.failsafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

	public static void main(String[] args) {

		// Map<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(201, "TwoZeroOne");
		map.put(202, "TwoZeroTwo");
		map.put(203, "TwoZeroThree");

		for (Map.Entry<Integer, String> newmap : map.entrySet())
			System.out.println(newmap);
		map.put(204, "TwoZeroFour");

	}

}
