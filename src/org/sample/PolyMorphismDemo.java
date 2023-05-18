package org.sample;

public class PolyMorphismDemo {  //Method Overloading
	
private void employee() {
System.out.println("Employee Details:- ");
System.out.println("================");
}	

private void employee(int age) {
System.out.println("Employee Age: "+age);
}
private void employee(String name) {
System.out.println("Employee Name: "+"name");
}
private void employee(String name,char gender, String address) {
System.out.println("Employee Gender: "+gender);
System.out.println("Employee Address: "+address);
}
private void employee(long phno, float ave) {
System.out.println("Employee phNo"+phno+"\n"+"Employee Ave : "+ave); 
}
public static void main(String[] args) {
PolyMorphismDemo Pd = new PolyMorphismDemo();

Pd.employee();
Pd.employee(30);
Pd.employee("Bala");
Pd.employee("name", 'M', "Chennai");
Pd.employee(8148016167l, 35.35f);

}

}
