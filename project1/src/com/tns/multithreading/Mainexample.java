package com.tns.multithreading;

class Eclipse implements Runnable{
	public void run() {
		System.out.println("Eclipse"+Thread.currentThread().getId());
	}
}

class Notepad implements Runnable{
	public void run() {
		System.out.println("Notepad"+Thread.currentThread().getId());
	}

}

class Chrome implements Runnable{
	public void run() {
		System.out.println("Chrome"+Thread.currentThread().getId());
	}
}

public class Mainexample {

	public static void main(String[] args) {
		
		System.out.println("Mainmethod"+Thread.currentThread().getId());
		
		Eclipse e=new Eclipse();
		Thread obj=new Thread(e);
		obj.start();
		
		Notepad n=new Notepad();
		Thread obj1=new Thread(n);
		obj1.start();
		
		Chrome c=new Chrome();
		Thread obj2=new Thread(c);
		obj2.start();

	}

}
