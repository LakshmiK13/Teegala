package com.tnsif.day7;

class ThreadOne extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread One: " + i);
     }
 }
}

class ThreadTwo extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread Two: " + i);
     }
 }
}

public class MultiThreading {
 public static void main(String[] args) {
     ThreadOne t1 = new ThreadOne();
     ThreadTwo t2 = new ThreadTwo();

     t1.start(); // starts first thread
     t2.start(); // starts second thread

     System.out.println("Main thread finished execution");
 }
}

