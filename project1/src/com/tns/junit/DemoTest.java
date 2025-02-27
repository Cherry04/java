package com.tns.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		Demo d=new Demo();
		int val=d.add(5, 4);
		int expected=9;
		if(val==expected) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
