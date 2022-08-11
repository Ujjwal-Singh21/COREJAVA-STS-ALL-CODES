package com.capg.corejava.overridingwrtVarArgs;

// if parent method has VarArgs as parameter say int..., now child has also VarArgs as parameter, 
// then overRiding will take place because method paramaters are now same.
// since overRiding -> method resolution is taken care by JVM -> based on "run time Object".
//------------------------------------------------------------------------------------------------
class ParentClass {
	public void display(int... i) {
		System.out.println("Parent Class");
	}
}

class ChildClass extends ParentClass {
	public void display(int... i) {
		System.out.println("Child Class");
	}
}

public class OverRidingDemo {

	public static void main(String[] args) {

		ParentClass parentclass = new ParentClass();
		parentclass.display(10);

		ChildClass childclass = new ChildClass();
		childclass.display(10);

		ParentClass parentclass1 = new ChildClass();
		parentclass1.display(10);

	}

}
