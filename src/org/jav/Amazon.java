package org.jav;

public class Amazon implements Netflix{

	@Override
	public void account() {
		
		System.out.println("permanent type");
	
		
	}

	@Override
	public void maintain() {
	
		System.out.println("current type");
		
	}
	 

	public void reach() {
		
		System.out.println("higher level");
		
		
	}
public static void main(String[] args) {
	Amazon a = new Amazon();
	a.account();
	a.maintain();
}

}
