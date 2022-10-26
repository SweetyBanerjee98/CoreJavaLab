/*
Program (2) :-Create  a HashMap to store the fees submitted by student .The key of the Map will be Student Id.
Create a method to find a student using the ID."
@Author:- Sweety Banerjee
#Date:- 26th Oct , 2022 
*/

package com.StudentFeesManage; //declaring the package

public class StudentDemo { // Creating StudentDemo class

	// Creating Several attributes of the EmployeeDemo class (instance variables)
	private int studentId;
	private String studentName;
	private String studentCourse;
	private double studentFeesAmount;
	private String studentFeesStatus;

	// initializing the default constructor
	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	} // End of default constructor

	// declaring parameterized constructor
	public StudentDemo(int studentId, String studentName, String studentCourse, double studentFeesAmount,
			String studentFeesStatus) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentFeesAmount = studentFeesAmount;
		this.studentFeesStatus = studentFeesStatus;
	} // end of the parameterized constructor

// creating getter & setter Getter and setters for getting and setting properties of the StudentDemo class
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public double getStudentFeesAmount() {
		return studentFeesAmount;
	}

	public void setStudentFeesAmount(double studentFeesAmount) {
		this.studentFeesAmount = studentFeesAmount;
	}

	public String getStudentFeesStatus() {
		return studentFeesStatus;
	}

	public void setStudentFeesStatus(String studentFeesStatus) {
		this.studentFeesStatus = studentFeesStatus;
	}

	@Override
	public String toString() {
		return "StudentDemo [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse="
				+ studentCourse + ", studentFeesAmount=" + studentFeesAmount + ", studentFeesStatus="
				+ studentFeesStatus + "]";
	}

} // End of the StudentDemo class
