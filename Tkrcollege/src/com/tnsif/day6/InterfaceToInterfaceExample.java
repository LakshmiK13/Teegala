package com.tnsif.day6;

public class InterfaceToInterfaceExample {
	public static void main(String[] args) {
        // Reference of Car
        Car myCar = new Tesla();
        myCar.start();
        myCar.drive();

        // Reference of Vehicle (parent interface)
        Vehicle v = new Tesla();
        v.start();   // only start() available here
    }
}

