package com.tnsif.day7;

public class JoinExample {
	public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            t.join();  // Main thread waits until child thread completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread runs after child thread completes!");
    }

}
