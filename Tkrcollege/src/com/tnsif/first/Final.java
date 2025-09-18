package com.tnsif.first;
public final class Final {   // class renamed
    final int SPEED = 100;

    final void display() {
        System.out.println("Speed limit is " + SPEED);
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.display();
    }
}



