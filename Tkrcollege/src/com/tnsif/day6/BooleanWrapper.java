package com.tnsif.day6;

public class BooleanWrapper {
	public static void main(String[] args) {
        boolean flag = true;
        Boolean boolObj = flag;
        boolean flag2 = boolObj;
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Primitive boolean: " + flag2);
    }

}
