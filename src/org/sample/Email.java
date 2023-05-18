package org.sample;

public  class Email extends Facebook{

	@Override
	void login() {
System.out.println("Login Facebook");		
	}
	
public static void main(String[] args){
  Email fb = new Email();
	
	fb.login();
		fb.loginFuntionality();
			
	}
}
