package com.tns.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
//ArrayList demo program

public class Arrayexample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Orange");
		al.add("Banana");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			//check the element is present or not
			System.out.println(itr.next());
			//print and move next
		}
		

	}

}
