package org.sample;

public class JpStReturn {
	
//private void add() {
private int add() {
	
	int a=20,b=30;
	int c = a+b;
	
	
return c; 	
	//System.out.println(c);
}
public static void main(String[] args) {
	
	JpStReturn c = new JpStReturn();
	//		c.add();
	
	int add = c.add();
	System.out.println(add);
}
}
