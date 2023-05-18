package com.String;

public class StringDemo1 {

	public static void main(String s3) {

		String s = "Welcome";
		String s1 = "welcome";
		String s2 = "Wel";
		
				
//equals() --> to compare 2 string and it is case sensitive		

		Boolean equals = s.equals(s1);
		System.out.println(equals);

//equalsIgnoreCase () ---> to campare 2 string and it is case sensitive

		boolean equalsignorecase = s.equalsIgnoreCase(s1);
		System.out.println(equalsignorecase);

//compareTo() ---> compare 2 string based on ASCII value
//ASCII --->  American Standard Code for Information Interchange
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);

		int compareTo2 = s.compareTo(s2);
		System.out.println(compareTo2);
	}
}
