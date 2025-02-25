package com.tns.collectionframework;
//demo for ArrayList

import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		//System.out.println(al.isEmpty())
		//add the data
		al.add(8);
		al.add(8);
		al.add(9);
		al.add(7);
		
		System.out.println("Size "+al.size());
		System.out.println(al);
		
		//check elements
		System.out.println(al.contains(2));
		
		//check the list is empty or not
		System.out.println(al.isEmpty());
		
		//remove the element
		System.out.println(al.remove(0));
		System.out.println(al);
		
	}
}


//ArrayList,LinkedList,Set,List
//TreeSet