package org.jav;

public class Customer extends EmployiCons {
	
	
		
		public Customer() {
			super("passed");
			System.out.println("having account in state");
		}
			
		public Customer(int i) {
			this();
			System.out.println("int id is " + i );
			
		}
			 
			public static void main(String[] args) {
				Customer cee = new Customer(25);
				
			}
			
		}
		
		
		
	
		
		
		
		
		
		
	


