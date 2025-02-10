package com.tns.exceptionhandling;
//demo for nested try catch

public class Nestedtrycatch {
	public static void check()
	{
		String str="TNS";
		int slength=str.length();
		System.out.println("String length"+slength);
		
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index out of bound"+ex.getMessage());
			}
			System.out.println("String length"+anotherstring.length());
		}
		catch(NullPointerException e) {
			System.out.println("Exception"+e.getMessage());
		
		}
	}

}


