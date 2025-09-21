package com.tnsif.day6;

public class DoubleWrapper {
	public static void main(String[] args) {
        double d = 55.66;
        Double doubleObj = d;
        double d2 = doubleObj;
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Primitive double: " + d2);
    }

}
