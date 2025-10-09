package com.tnsif.lambdaexpressions;
@FunctionalInterface
interface Addable {
    int add(int a, int b);
}

public class LambdaWithParameter {
    public static void main(String[] args) {
        // Lambda with parameters
        Addable sum = (a, b) -> a + b;

        System.out.println("Sum: " + sum.add(10, 20));
        System.out.println("Sum: " + sum.add(50, 100));
    }
}
