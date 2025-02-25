package com.tns.stringdemo;
//demo for strong builder

public class Stringbuilderdemo {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Welcome");
		
		//concat the data
		
		b.append("to java");
		System.out.println(b);
		
		//insert the data
		b.insert(2, "hi");
		System.out.println(b);
		
		//delete the data
		b.delete(2, 5);
		System.out.println(b);
		
		//reverse of the string
		b.reverse();
		System.out.println(b);
		

	}

}