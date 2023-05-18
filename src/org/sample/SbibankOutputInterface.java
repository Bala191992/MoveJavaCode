package org.sample;

public class SbibankOutputInterface implements SbiBank{
	
	@Override
	public void saving() {
System.out.println("Saving -- 10%");
	}
@Override
public void deposite() {
System.out.println("deposite -- 8%");
}	
public static void main(String[] args) {
	SbibankOutputInterface sb = new SbibankOutputInterface();
			
			sb.saving();
			sb.deposite();
			
			System.out.println(a);
}
}
