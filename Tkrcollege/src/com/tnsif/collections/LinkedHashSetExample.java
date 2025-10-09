package com.tnsif.collections;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Java");
        lhs.add("Python");
        lhs.add("C++");
        lhs.add("Java"); // duplicate ignored

        System.out.println("LinkedHashSet: " + lhs);
    }
}


