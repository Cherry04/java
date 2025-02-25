package com.tns.collections;

import java.util.Stack;

//demo for stack
public class Stackdemo {

	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
		ob.push(1);
		ob.push(7);
		ob.push(5);
		ob.push(3);
		
		System.out.println("Stack elements"+ob);
		System.out.println(ob.peek());
		if(ob.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Not empty");
		}
		System.out.println(ob.search(7));

	}

}
