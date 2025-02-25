package com.tns.collectionframework;
//demo for vector
import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		
		int size=v.size();
		System.out.println(size);
		v.add("Blue");
		v.add("White");
		v.add("Orange");
		v.add("Red");
		
		int cap=v.capacity();
		System.out.println(cap);
		
		v.add(null);
		v.add("Blue");
		v.add("Whirte");
		v.add("Orange");
		v.add("Red");
		v.add("Blue");
		v.add("White");
		v.add("Orange");
		v.add("Red");
		
		int cap1=v.capacity();
		System.out.println(cap1);
		System.out.println(v);

	}

}
