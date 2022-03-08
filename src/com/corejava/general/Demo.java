package com.corejava.general;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Function
public class Demo {

	public static void main(String[] args) {

		Function<String, Integer> function = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {

				return t.length();
			}

		};
		System.out.println(function.apply("Yamini"));

		// lambda

		Function<String, Integer> function1 = t -> t.length();

		System.out.println(function1.apply("Ujjwal"));

	}

}
