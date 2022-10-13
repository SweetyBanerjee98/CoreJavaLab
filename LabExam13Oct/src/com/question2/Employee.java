package com.question2; //declaring  the package

public class Employee { // declaring the class Employee

	/// Creating Several attributes of the Employee class with instance variable
	private int empId;
	private String empName;
	private String empEmail;
	protected double empSalary;

	// initializing the default constructor
	public Employee() {
		super();
	} // end of the default constructor

	// declaring parameterized constructor
	public Employee(int empId, String empName, String empEmail) {
		super();

		// initializing the variables
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}

	// creating getter & setter
	// Getter and setters for getting and setting properties of the Employee class
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	// declaring the method and passing through the parameter
	public void calculateEmpSalary(int totaltimeDuration) {
		// initializing the empSalary from the emp class
		this.empSalary = 0;
	}// end of the method

} // end of the class
