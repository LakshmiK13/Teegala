package com.tnsif.collections;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Lakshmi");
        map.put(2, "Karthik");
        map.put(3, "Avinash");

        System.out.println("Map elements: " + map);
        System.out.println("Value at key 2: " + map.get(2));
    }
}
