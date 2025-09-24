package com.tnsif.day7;

public class ThreadA extends Thread{
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            Thread.yield();  // Hint to scheduler: let other threads run
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }

}
