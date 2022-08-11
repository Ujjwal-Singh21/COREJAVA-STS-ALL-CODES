package com.capg.corejava.VariablesShadowing;

// There is no concept of Variable Overriding first of all.
// If same variable is present in Parent class as well as in Child class, then it is called Shadowing.
// Variable Resolution -> always taken care by Compiler -> based on reference type.
// Whether variables are static variables or Instance variables, the concept is same in both cases.
//----------------------------------------------------------------------------------------------------
class Parent {
	static String name = "Parent";
}

class Child extends Parent {
	static String name = "Child";
}

public class VariablesShadowing {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();

		System.out.println(p.name);
		System.out.println(c.name);
		System.out.println(p1.name);	
	}
}
