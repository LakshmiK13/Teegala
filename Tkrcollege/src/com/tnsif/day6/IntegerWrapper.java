package com.tnsif.day6;

public class IntegerWrapper {
	public static void main(String[] args) {
        int i = 100;
        Integer intObj = i;
        int i2 = intObj;
        System.out.println("Integer Object: " + intObj);
        System.out.println("Primitive int: " + i2);
    }

}
