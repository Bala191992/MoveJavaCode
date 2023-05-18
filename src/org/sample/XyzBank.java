package org.sample;
//Child 
public class XyzBank extends AbcBank{
 @Override
public void Saving() {
System.out.println("Saving - 10");
 }	
@Override
	public void Deposit() {
System.out.println("Deposit -- 12");

}
 public static void main(String[] args) {
	XyzBank s = new XyzBank();
			s.Saving();
			s.Deposit();
}
 
}
