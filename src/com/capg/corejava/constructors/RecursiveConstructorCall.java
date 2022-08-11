package com.capg.corejava.constructors;

// Here, even before running the code, while compiling itself compiler throws an error saying,
// Error -> Recursive constructor invocation RecursiveConstructorCall(int)
// Hence, Recursive constructor invocation is always a Compile time error.
//---------------------------------------------------------------------------------------------
public class RecursiveConstructorCall {

	RecursiveConstructorCall() {
		this(10);
	}

	RecursiveConstructorCall(int i) {
		this();
	}

	public static void main(String[] args) {

		System.out.println("Hello");
	}

}
