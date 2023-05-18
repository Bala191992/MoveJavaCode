package org.demo;

public class NestedIf {
	public static void main(String[] args) {
		
		int a = 5;
		
		if (a<15) {
			System.out.println("print out of IF");
			
		if (a==10) {
			System.out.println("Print inner IF");
		}	
		}
		else {
			System.out.println("print else present");
		}
}
}