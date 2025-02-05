package com.tns.polymorphism;

public class Construct {
	private float x;
	private float y;
	
	public Construct() {
		x=9.0f;
		y=8.07f;
	
	}
	public Construct(float f) {
		this.x=x;
		y=6.5f;
	}
	public Construct(float x,float y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Construct c=new Construct();
		System.out.println(c);
		Construct c1=new Construct(7f);
		System.out.println(c1);
		Construct c2=new Construct(6.0f,5.4f);
		System.out.println(c2);
	}

}
