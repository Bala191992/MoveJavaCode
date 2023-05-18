package org.sample;

public class MultipleInheritanceOutput implements MultipleInheritance,MultipleInheritance2{
	
	@Override
	public void test1() {
System.out.println("Saving--8%");		
	}
	
	
	@Override
	public void test2() {
System.out.println("Deposite--10%");		
	}
	
	@Override
	public void test3() {
System.out.println("Fixed depostie--12%");
	}

	public static void main(String[] args) {
		
		MultipleInheritanceOutput ts = new MultipleInheritanceOutput();
				ts.test1();
		ts.test2();
	ts.test3();	
	}
	
}
