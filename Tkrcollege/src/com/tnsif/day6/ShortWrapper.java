package com.tnsif.day6;

public class ShortWrapper {
	public static void main(String[] args) {
        short s = 20;
        Short shortObj = s;
        short s2 = shortObj;
        System.out.println("Short Object: " + shortObj);
        System.out.println("Primitive short: " + s2);
    }

}
