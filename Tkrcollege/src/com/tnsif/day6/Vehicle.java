package com.tnsif.day6;

public interface Vehicle {
	    void start();
	}

	// Second interface extends the first one
	interface Car extends Vehicle {
	    void drive();
	}

	// Class implements the child interface
	class Tesla implements Car {
	    public void start() {
	        System.out.println("Tesla is starting...");
	    }
	    public void drive() {
	        System.out.println("Tesla is driving smoothly...");
	    }
	}

