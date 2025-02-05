package com.tns.staticprograms;

public class Employee {
	int id;
	String name;
	static String companyname="TNS";
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name+" "+companyname);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee(1,"Hema");
		Employee e1=new Employee(2,"meeena");
		Employee e2=new Employee(3,"Sonali");
		e.display();
		e1.display();
		e2.display();
		
	}
	
}
