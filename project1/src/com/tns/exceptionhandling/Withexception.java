package com.tns.exceptionhandling;

public class Withexception {

	public static void main(String[] args) {
		int d=0;
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught"+e);
			System.out.println("hello");
		}

	}

}
