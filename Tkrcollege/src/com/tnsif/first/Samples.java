package com.tnsif.first;

public class Samples {
	String message;
		Samples(String msg){
			message=msg;
			System.out.println("this is constructor:"+message);
			
		}
		public void show() {
			System.out.println("this is method,message="+message);
		}
	 
 
		public static void main(String[] args) {
			Samples ob=new Samples("Lakshmi");
			ob.show();

		}

	}



