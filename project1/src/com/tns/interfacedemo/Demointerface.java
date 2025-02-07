package com.tns.interfacedemo;

public class Demointerface implements Childinterface,Interfaceone{
	@Override
	public void print() {
		System.out.println("Print");
	}
	
	@Override
	public void show() {
		System.out.println("Show");
	}
	public static void main(String[] args) {
		Demointerface d=new Demointerface();
		d.print();
		d.show();
	}

}
