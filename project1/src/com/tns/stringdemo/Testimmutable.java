package com.tns.stringdemo;

public class Testimmutable {
	public static void main(String[] args) {
		String s="Sachin";
		s.concat("Tendulkar");
		
		System.out.println(s);
		s=s.concat("Tendulkar");
		System.out.println(s);
	}

}
