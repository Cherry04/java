package com.tns.interfacedemo;

public class RBI implements Bank {
	
	
	@Override
	public float rateofinterest() {
		return 9.7f;
	}

	public static void main(String[] args) {
		
		Bank b=new RBI();
		System.out.println("Get rate of interest"+b.rateofinterest());

	}

}
