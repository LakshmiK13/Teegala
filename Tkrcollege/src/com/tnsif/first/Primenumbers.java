package com.tnsif.first;

public class Primenumbers {

	public static void main(String[] args) {
	
		        System.out.println("Prime numbers between 1 and 100 are:");

		        for (int num = 2; num <= 100; num++) {
		            boolean isPrime = true;

		            // check if num is divisible by any number from 2 to sqrt(num)
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.print(num + " ");
		            }
		        }
		    }
		}


	
