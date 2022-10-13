/*
Program (4) :- Create a cutom exception (Name cannot be null).
The user will enter student details , it will throw an exception if the name or id id null
@Author:- Sweety Banerjee
#Date:- 13th Oct , 2022 
*/

package com.question4; //declaring the package

//declaring the class
public class StudentDetailsDemo {

	// declaring the main method
	public static void main(String[] args) {

		// declaring the variable and initializing the value
		String name = "sweety";
		String id = "01";

		// starting try catch block
		try {
			checkName(name);
		} catch (Exception e) {
			System.out.println("exception will occured " + e);
		}

		// stating id try catch
		try {
			checkID(id);
		} catch (Exception e) {
			System.out.println("exception will occured " + e);
		}
	}
	// end of the main method

	// declaring the method and checking the name
	static void checkName(String name) throws Exception {

		// starting the if block
		if (name == null) {
			throw new Exception("Name Can't be null");
		} else {
			System.out.println("Student Name: " + name);
		}
	} // end of the method

	// declaring the method
	static void checkID(String id) throws Exception {

		if (id == null) {
			throw new Exception("ID cannot be null");
		} else {
			System.out.println("Student id: " + id);
		}
	} // end of the method
} // end of the class
