package com.tns.interfacedemo;
// demo for nested interface
public interface Myinterface {
	void calucatearea();
	interface Myinnerinterface{ 
//		nested interface
		int id=30;
		void print();
	}

}
