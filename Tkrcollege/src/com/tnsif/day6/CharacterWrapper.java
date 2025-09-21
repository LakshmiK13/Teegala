package com.tnsif.day6;

public class CharacterWrapper {
	 public static void main(String[] args) {
	        char c = 'A';
	        Character charObj = c;
	        char c2 = charObj;
	        System.out.println("Character Object: " + charObj);
	        System.out.println("Primitive char: " + c2);
	    }

}
