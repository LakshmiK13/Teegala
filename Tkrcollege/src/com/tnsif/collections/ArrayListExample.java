package com.tnsif.collections;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple"); // duplicate allowed

        System.out.println("ArrayList: " + list);
    }
}


