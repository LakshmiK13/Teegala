package com.tnsif.day5;

public class OverloadingExample {
	public void demo() {
	System.out.println("this is default");
	}
	public void demo(int a) {
		System.out.println("this is having one parameter");
		
	}
	public void demo(int a,int b) {
		System.out.println("this is value of a is:"+a+"the value of b  is:"+b);
	}
}
