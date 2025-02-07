package com.tns.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface{
	@Override
	public void print() {
		System.out.println("Inner interface method");
	}

}
