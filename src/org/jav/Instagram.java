package org.jav;

public class Instagram extends Facebook{

	@Override
	public void password() {
		System.out.println("password is 12345");
		
	}

	public static void main(String[] args) {
		Instagram ins = new Instagram();
		ins.login();
		ins.password();
		
	}
}
