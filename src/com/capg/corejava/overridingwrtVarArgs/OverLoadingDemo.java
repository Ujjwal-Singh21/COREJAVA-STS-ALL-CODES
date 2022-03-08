package com.capg.corejava.overridingwrtVarArgs;

// if parent method has VarArgs as parameter say int..., but child has no vargs and just has int, then "overloading" 
// will take place, because method paramaters are different.
// since overLoading -> method resolution is taken care by compiler, based on reference type.

class Parent {
	public void display(int... i) {
		System.out.println("Parent Class");
	}
}

class Child extends Parent {
	public void display(int i) {
		System.out.println("Child Class");
	}
}

public class OverLoadingDemo {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.display(10);

		Child child = new Child();
		child.display(10);

		Parent parent1 = new Child();
		parent1.display(10);

	}

}
