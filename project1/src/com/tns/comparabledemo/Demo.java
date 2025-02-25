package com.tns.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("DELL",50000,8));
		laps.add(new Laptop("APPLE",80000,9));
		laps.add(new Laptop("HP",20000,3));
		
		Collections.sort(laps);
		
		for(Laptop l:laps) {
			System.out.println(l);
		}
	}

}
