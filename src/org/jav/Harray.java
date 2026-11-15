package org.jav;

public class Harray {
	
	public static void main(String[] args) {
		 int []a = new int[6];
		 
		 a[0] = 10;
		 a[1] = 20;
		 a[2] = 30;
		 a[3] = 20;
		 a[4] = 40;
		 a[5] = 50;
		 
		 System.out.println("Particular value a " + a.length );
		 
		 System.out.println("check the index value " + a[3]);
		 
		 //for loop 
		 
		 for (int i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
			
		}
		 
		 //enhanced loop
		 System.out.println("Enchanced for loop");
		 
		 for (int b : a) {
			 System.out.println(b);
			 
			
		}
		 
		 
	}

}
