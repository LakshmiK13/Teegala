package com.tnsif.collections;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(10);
        q.add(20);

        System.out.println("Queue elements: " + q);
        System.out.println("Head element: " + q.peek());
        q.remove();
        System.out.println("After removing head: " + q);
    }
}



