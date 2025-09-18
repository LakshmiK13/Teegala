package com.tnsif.day5;

public class Overriding1 {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();   // Upcasting
        a.sound();       // Dog’s version

        a = new Cat();
        a.sound();       // Cat’s version
    }
}

