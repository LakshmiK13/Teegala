package com.tnsif.exceptionhandlings;
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues normally...");
    }
}


