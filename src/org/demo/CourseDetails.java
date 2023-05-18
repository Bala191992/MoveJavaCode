package org.demo;

public class CourseDetails {
	// Method name
	public void JavaCourse() {
		System.out.println("Java Course Not Started");
	}

	public void SeleniumCourse() {
		System.out.println("Selenium Course not started ");
	}

//MainMethod
	public static void main(String[] args) {
		// Classname.objregname = new classname
		CourseDetails cd = new CourseDetails();
		cd.JavaCourse();
		cd.SeleniumCourse();

		EmployeeDetails Ed = new EmployeeDetails();
		Ed.empId();
		Ed.empName();
	}

}
