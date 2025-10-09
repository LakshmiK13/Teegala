package com.tnsif.collections;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored
        set.add(30);

        System.out.println("HashSet: " + set);
    }
}

