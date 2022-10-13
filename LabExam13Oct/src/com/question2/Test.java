/*
Program (2) :- Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 and functionality .Create a test class
@Author:- Sweety Banerjee
#Date:- 13th Oct , 2022 
*/
package com.question2; //declaring the package

public class Test { // declaring the test class

	// calling the main method
	public static void main(String[] args) {

		/*----------- Creating the hourly employee-------------------*/

		System.out.println("--------- Employee Details Hourly-------------"); // printing the statement

		// creating object emp1 for employee 1 from class HourlyEmployee
		HourlyEmployee emp1 = new HourlyEmployee(01, " Sweety ", " s@123.com ");

		// calling calculateEmp and passing the hours
		emp1.calculateEmpSalary(12);

		// printing the Employee details
		System.out.println("  Employee Id : " + emp1.getEmpId());
		System.out.println("  Employee Name : " + emp1.getEmpName());
		System.out.println("  Employee Email : " + emp1.getEmpEmail());
		System.out.println("  Employee Salary per day  : " + emp1.getEmpSalary() + "Rs");

		// Creating the Salaried Employee
		System.out.println("----------- Salaried Employee Details ------------"); // printing the statement

		// creating the object
		SalariedEmployee emp2 = new SalariedEmployee(02, " Juhi ", " juhi@123.com ");

		// calling calculateEmp and passing the months
		emp2.calculateEmpSalary(4);

		// printing the employee details
		System.out.println("Employee Id : " + emp2.getEmpId());
		System.out.println("Employee Name  : " + emp2.getEmpName());
		System.out.println("Employee Email  : " + emp2.getEmpEmail());
		System.out.println("Employee Salary per month : " + emp2.getEmpSalary() + "Rs");

	} // end of the main

} // end of the class
