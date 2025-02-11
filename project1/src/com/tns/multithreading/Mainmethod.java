package com.tns.multithreading;

class Eclipsee extends Thread{
	public void run() {
		System.out.println("Eclipse"+Thread.currentThread().getId());
	}
}

class Notepadd extends Thread {
	public void run() {
		System.out.println("Notepad"+Thread.currentThread().getId());
	}

}

class Chromee extends Thread{
	public void run() {
		System.out.println("Chrome"+Thread.currentThread().getId());
	}
}

public class Mainmethod {
	public static void main(String[] args) {
		System.out.println("Mainmethod"+Thread.currentThread().getId());
		
		Eclipsee e=new Eclipsee();
		e.start();
		
		Notepadd n=new Notepadd();
		n.start();
		
		Chromee c=new Chromee();
		c.start();
	}

}

