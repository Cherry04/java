package com.tns.exceptionhandling;
//No exception (Finally Block)

public class Test1 {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
		}
		catch(Exception e) {
			System.out.println("Java");
		}
		finally {
			System.out.println("Welcome to python");
		}

	}

}
