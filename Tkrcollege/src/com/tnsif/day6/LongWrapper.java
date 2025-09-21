package com.tnsif.day6;

public class LongWrapper {
	public static void main(String[] args) {
        long l = 5000L;
        Long longObj = l;
        long l2 = longObj;
        System.out.println("Long Object: " + longObj);
        System.out.println("Primitive long: " + l2);
    }

}
