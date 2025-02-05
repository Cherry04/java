package com.tns.polymorphism;

public class Car extends Vehicle {
	
	@Override
	void display() {
		System.out.println("Car class");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.display();
	}

}
