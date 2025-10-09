package com.tnsif.collections;
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "Banana");
        tm.put(1, "Apple");
        tm.put(2, "Mango");

        System.out.println("TreeMap (Sorted): " + tm);
    }
}

