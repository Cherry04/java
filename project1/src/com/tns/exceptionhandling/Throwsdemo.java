package com.tns.exceptionhandling;

public class Throwsdemo {
	
	void m1() {
		System.out.println("No Exception");
	}
	
	void m2() {
		System.out.println("Device error");
	}
	
	void m3() {
		
		System.out.println("File not found");
		
	}
	public static void main(String[] args) {
		Throwsdemo d=new Throwsdemo();
		d.m1();
		try {
			d.m2();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			d.m3();
		}
		catch(Exception t) {
			System.out.println(t.getMessage());
		}
	}

}
