package com.tnsif.collections;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(101, "Java");
        lhm.put(102, "Python");
        lhm.put(103, "C++");

        System.out.println("LinkedHashMap: " + lhm);
    }
}


