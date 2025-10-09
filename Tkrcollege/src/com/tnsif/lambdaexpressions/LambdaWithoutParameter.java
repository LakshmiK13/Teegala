package com.tnsif.lambdaexpressions;
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaWithoutParameter {
    public static void main(String[] args) {
        // Lambda with no parameter
        Greeting greet = () -> {
            System.out.println("Hello! Welcome to Java Lambda Expressions 😊");
        };

        greet.sayHello();
    }
}


