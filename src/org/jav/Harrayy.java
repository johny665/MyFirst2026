package org.jav;

public class Harrayy {
	// 2d array
	public static void main(String[] args) {
		
		int [][]a = new int [3][3];
		
	a[0] [0] = 10;
	a[0] [1] = 20;
	a[0] [2] = 30;
	
	a[1] [0] = 1;
	a[1] [1] = 2;
	a[1] [2] = 3;
	
	a[2] [0] = 11;
	a[2] [1] = 12;
	a[2] [2] = 13;
		
	System.out.println("particular value of array " + a[2][0]);
	
	for(int [] b : a ) {
		for (int c : b) {
			System.out.println(c);		
			
			
		}
	}
	
		
	}

}
