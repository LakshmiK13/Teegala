package com.tnsif.lambdaexpressions;
import java.util.*;

public class LambdaWithCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lakshmi", "Karthik", "Avinash", "Sumaanjali");

        // Using lambda in forEach
        names.forEach(name -> System.out.println("Name: " + name));
    }
}
