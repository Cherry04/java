package com.tns.polymorphism;
//Compile time polymorphism ,static or early binding
public class Methodoverloading {
	int add(int a,int b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Methodoverloading m=new Methodoverloading();
		System.out.println(m.add(5, 4));
		System.out.println(m.add(60, 5.4));
	}

}
