package com.tnsif.day6;

public class ByteWrapper {
	public static void main(String[] args) {
        byte b = 10;               // primitive
        Byte byteObj = b;          // autoboxing
        byte b2 = byteObj;         // unboxing
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Primitive byte: " + b2);
    }
}
