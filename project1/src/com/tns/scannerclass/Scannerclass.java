package com.tns.scannerclass;
import java.util.Scanner;

public class Scannerclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter number ");
		int num=sc.nextInt();
		System.out.println("Displaying info " +name+" "+num);
	}

}
