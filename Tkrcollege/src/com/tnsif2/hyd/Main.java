package com.tnsif2.hyd;

public class Main 

		import com.tnsif.first.Car; // 

		public class Main {
		    public static void main(String[] args) {
		        Car car1 = new Car();
		        car1.brand = "Toyota";
		        car1.color = "Red";
		        car1.speed = 120;

		        Car car2 = new Car();
		        car2.brand = "Tesla";
		        car2.color = "Black";
		        car2.speed = 150;

		        car1.displayInfo();
		        car1.drive();

		        car2.displayInfo();
		        car2.drive();
		    }
		}


