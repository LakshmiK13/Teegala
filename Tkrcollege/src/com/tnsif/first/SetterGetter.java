package com.tnsif.first;

	public class SetterGetter {
	   
	    private String name;
	    private int age;
	    public void setName(String n) {
	        name = n;
	    }
	    public String getName() {
	        return name;
	    }

	    public void setAge(int a) {
	        if (a > 0) {  
	            age = a;
	        } else {
	            System.out.println("Age must be positive!");
	        }
	    }

	    public int getAge() {
	        return age;
	    }

	    // Main method
	    public static void main(String[] args) {
	        SetterGetter s = new SetterGetter();

	        // using setters
	        s.setName("Lakshmi");
	        s.setAge(21);

	        // using getters
	        System.out.println("Student Name: " + s.getName());
	        System.out.println("Student Age: " + s.getAge());
	    }
	}


