package com.tns.superkey;

public class Demoofsuper {
	int a=7;
	void drink() {
		System.out.println("Coffee");
	}

}

class Child extends Demoofsuper


{
	int a=30;
	void drink() {
		System.out.println("Boost");
	}
	
	void display() {
		System.out.println(super.a);
		System.out.println(a);
		super.drink();
	    drink();
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.display();
	}
}
