package org.sample;

public class systemExit {

	public static void main(String[] args) {
   for (int i = 0; i <10; i++) {	
	   if (i==6) {
			System.exit(0);
		}
		System.out.println(i);
	}
System.out.println("\nSuccess");
}
}
