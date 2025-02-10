package com.tns.exceptionhandling;
//demo for exception
public class Division {
	
		public static void divide() {
			int a=6,b=0,c;
			try {
				System.out.println("hello");
				c=a/b;
				System.out.println("Division"+c);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught"+e.getMessage());
			}
			catch(ArithmeticException f) {
				System.out.println("Exception caught"+f.getMessage());
			}
			catch(IndexOutOfBoundsException d) {
				System.out.println("Exception caught"+d.getMessage());
			}
			catch(Exception j) {
				System.out.println(j.getMessage());
			}
			
	}
}


