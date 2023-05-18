package org.sample;

//Import Packagename.Classname
import org.demo.CourseDetails;			
import org.demo.EmployeeDetails;	
//import org.demo.*;

public class CompanyDetails {
	// Method Name
	private void CtsCompany() {
		System.out.println("Cts Chennai");
	}

	private void TcsCompany() {
		System.out.println("Tcs Siruseri");
	}

	public static void main(String[] args) {
		// Classname.objrefname=new classname

		CompanyDetails Cd = new CompanyDetails();
		Cd.CtsCompany();
		Cd.TcsCompany();

		CourseDetails C = new CourseDetails();
		C.JavaCourse();
		C.SeleniumCourse();

		EmployeeDetails Ed = new EmployeeDetails();
		Ed.empId();
		Ed.empName();

	}
}
