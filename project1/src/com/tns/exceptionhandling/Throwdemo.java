package com.tns.exceptionhandling;

public class Throwdemo {
	public void validate(int age) {
		try {
			if(age<18) {
				throw new ArithmeticException("You are not elgible");
			}
			else {
				System.out.println("You are elgible");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
	}
	
	public static void main(String[] args) {
		Throwdemo d=new Throwdemo();
		d.validate(10);
		System.out.println("Hello");
	}

}


//System.out.println(e);