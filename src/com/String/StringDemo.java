package com.String;

public class StringDemo {

	public static void main(String[] args) {
				//	012345678901234567890123456789012345
		String s = "Computer Programming Lauguage @123      ";

	
		// Length()--> to find the no of letters is given string

		int length = s.length();
		System.out.println("Number Of String :"+length);
		System.out.println(s.length() - 1);

		// toUppercase()---> Convert string to Uppercase();

		String Uppercase = s.toUpperCase();
		System.out.println(Uppercase);

		// toLower case()--> Convert String to lowercase();

		String lowercase = s.toLowerCase();
		System.out.println(lowercase);

		// Startwith(Value) ---> to check String starts with particular value

		boolean Startswith = s.startsWith("C");
		System.out.println(Startswith);

		// endwith(value) --> to check string ends with particular value
		boolean Endwith = s.endsWith("13");
		System.out.println(Endwith);

		// contains (Value) --> to check whether the string contains particular value or
		// not
		boolean contains = s.contains("put");
		System.out.println(contains);

		// substring (Start index) ---> Start particular index value

		String substring = s.substring(10);
		System.out.println("Start particular index value :"+substring);

		// substring ( Start index , End index) --->

		String substring1 = s.substring(9, 23);
		System.out.println(substring1);

		// CharAt(index) --> used to find the character present inthe particular index
		// value

		char charAt = s.charAt(4);
		System.out.println(charAt);

		// index of (Value) --> to find last in particular value

		int index = s.indexOf("m");
		System.out.println(index);

		// last index of (value) -->find last in particular value

		int lastindex = s.lastIndexOf("m");
		System.out.println(lastindex);

		// replace (old, New) --> replace one char or word to another char or word

		String replace = s.replace("Computer", "Java");
		System.out.println(replace);

		// isEmpty() --> to check whether string is empty or not

		boolean empty = s.isEmpty();
		System.out.println(empty);

		String s1 = "";

		Boolean empty2 = s1.isEmpty();
		System.out.println(empty2);
		
		//trim()  --> remove spaces present before and after the words
		
		String trim = s.trim();
			System.out.println(trim);

	}
}
