package com.question2; //declaring the main method

//declaring the SalariedEmployee class extends with employee
public class SalariedEmployee extends Employee {

	// declaring the default constructor
	public SalariedEmployee() {
		super();
	} // end of the constructor

	// declaring the parameterized constructor
	public SalariedEmployee(int empId, String empName, String empEmail) {
		super(empId, empName, empEmail);
	}

	@Override
	public void calculateEmpSalary(int totalMonths) { // declaring the method with passing the parameter
		// initializing the empSalary into month
		this.empSalary = totalMonths * 48000;
	} // end of the method
} // end of the class
