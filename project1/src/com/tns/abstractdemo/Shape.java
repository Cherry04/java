package com.tns.abstractdemo;

public abstract class Shape {
	protected float area;
	
	abstract void calarea();
	
	void show() {
		System.out.println("Area of shape"+area);
	}

	public String toString() {
		return "Shape[area="+area+"]";
	}

}
