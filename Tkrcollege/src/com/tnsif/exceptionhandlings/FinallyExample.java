package com.tnsif.exceptionhandlings;
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}

