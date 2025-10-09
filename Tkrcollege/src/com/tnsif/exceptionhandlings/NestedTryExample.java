package com.tnsif.exceptionhandlings;
public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            try {
                arr[5] = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Divide by zero");
            }
            arr[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of range");
        }
    }
}

