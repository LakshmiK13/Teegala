package com.lakshmi.assignment.utilities;

	import com.lakshmi.assignment.employees.Manager;
	import com.lakshmi.assignment.employees.Developer;
	import com.lakshmi.assignment.utilities.EmployeeUtilities;

	/**
	 * Main class to test Employee system
	 */
	public class AssignmentMain {
	    public static void main(String[] args) {
	        // Create Manager and Developer objects
	        Manager m = new Manager("Alice", 101, 80000, "HR");
	        Developer d = new Developer("Bob", 102, 60000, "Java");

	        // Use EmployeeUtilities
	        EmployeeUtilities util = new EmployeeUtilities();

	        System.out.println("=== Manager Info ===");
	        util.displayEmployeeInfo(m);
	        System.out.println("Department: " + m.getDepartment());

	        System.out.println("\n=== Developer Info ===");
	        util.displayEmployeeInfo(d);
	        System.out.println("Programming Language: " + d.getProgrammingLanguage());
	    }
	}

