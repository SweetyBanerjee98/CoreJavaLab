package com.question2; //declaring the package

// declaring the HourlyEmployee class & accessing all the features of the employee class
public class HourlyEmployee extends Employee {

	// declaring the default constructor
	public HourlyEmployee() {
		super();
	} // end of the constructor

	// declaring the parameterized constructor
	public HourlyEmployee(int empId, String empName, String empEmail) {
		super(empId, empName, empEmail);
	}

	@Override
	public void calculateEmpSalary(int totalHours) { // declaring the method
		// initializng the empSalary
		this.empSalary = totalHours * 550; // calculating hours into salary
	} // end of the method
} // end of the class
