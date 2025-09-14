package com.tnsif.first;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		        int num = 153;   // you can change this value
		        int original = num;
		        int sum = 0;

		        while (num > 0) {
		            int digit = num % 10;         // get last digit
		            sum = sum + (digit * digit * digit); // cube of digit
		            num = num / 10;               // remove last digit
		        }

		        if (sum == original) {
		            System.out.println(original + " is an Armstrong number.");
		        } else {
		            System.out.println(original + " is not an Armstrong number.");
		        }
		    }
		}

		       
		
		        
		 


	