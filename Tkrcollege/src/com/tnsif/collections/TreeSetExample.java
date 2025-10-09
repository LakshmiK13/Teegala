package com.tnsif.collections;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(20);

        System.out.println("TreeSet (Sorted): " + ts);
    }
}


