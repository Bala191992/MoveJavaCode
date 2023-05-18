package org.demo;

import java.util.Scanner; //scanner belongs to Java.Utill package

public class DemoScanner {
	public static void main(String[] args) {
		// nestedLoop la Print option harizontal la print panradhu
//		for (int i = 0; i <=6; i++) {
//			
//			for (int j = 0; j < 5; j++) {
//				System.out.print(i);			//Print(horizotal Println(next line by line)
//			}
//			System.out.println();
//		}

		// Scanner With Demo (Pre-defined class)

		Scanner s = new Scanner(System.in);  //--->(System.in--to get the input) //--->(System.out.println to print the value)
		
		System.out.println("Enter Your Name : ");
		String next = s.next();			//Int a = 20(oru data type  oru variable  = output)(String-datatype, next-vari = s.next-output
		System.out.println(next);
		System.out.println("Enter Your ID :");
		int nextint = s.nextInt();
		System.out.println(nextint);
		System.out.println("Enter Your Phone Number :");
		long nextLong = s.nextLong();
		System.out.println(nextLong);
		System.out.println("Enter Your Salary :");
		float nextFloat = s.nextFloat();
		System.out.println(nextFloat);
		System.out.println("Enter your Gender :");
		char charAt = s.next().charAt(2);
		System.out.println(charAt);
		System.out.println("Enter Your Result :");
		boolean nextBoolean = s.nextBoolean();
		System.out.println(nextBoolean);
		
		System.out.println("\n Employee Details :");
		System.out.println("===================");
		System.out.println("Enter Your Name         :" + next);
		System.out.println("Enter Your ID           :" + nextint);
		System.out.println("Enter Your Phone Number :" + nextLong);
		System.out.println("Enter Your Salary       :" + nextFloat);
		System.out.println("Enter your Gender       :" + charAt);
		System.out.println("Enter Your Result       :" + nextBoolean);

//		Scanner s = new Scanner(System.in);
//		Scanner s1 = new Scanner(System.in);
//
//		// ---> NextLine after next --> No Issue
//		// ---> "Next" after nextline ---> issue
//
//		System.out.println("Enter Your city");	//it's accept the space
//		String nextLine = s.nextLine();
//		System.out.println(nextLine);
//
//		System.out.println("enter your name ");	//it's egnore the space
//		String next = s.next();
//		System.out.println(next);

	}

}
