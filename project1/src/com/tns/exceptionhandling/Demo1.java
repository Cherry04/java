package com.tns.exceptionhandling;

class Sleep extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Demo1 "+Thread.currentThread().getId());
			try {
				sleep(2000);//2s
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class Demo1{
	public static void main(String[] args) {
		Sleep s=new Sleep();
		s.start();
	}
	
}
