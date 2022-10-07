/*
 Program : Write a code to check a string is palindrome or not
 @author : Sweety Banerjee
 Date: 7/10/2022
 */

//Declaring the package
package com.demo;

import java.util.Scanner; //importing the required class

public class PalindromeDemo { // Declaring the PalidromeDemo class

	// Declaring palindromeCheck Method & passing the String value
	static boolean palindromeCheck(String strn) {

		boolean status; // declaring the status variable with boolean datatype

		// The java string toCharArray() method converts the given string into a
		// sequence of characters
		char ch[] = strn.toCharArray();

		String revstrString = ""; // empty String

		for (int i = ch.length - 1; i >= 0; i--) { // Starting the loop

			revstrString += ch[i];

		}

		// This method compares this String to another Object & Storing the value to the
		// flag variable
		int flag = strn.compareTo(revstrString);

		// if the given condition true then it returns true otherwise false
		if (flag == 0) {
			status = true;
		}

		else {
			status = false;
		}

		return status;
		// returning the status
	}
	// Palindrome check method end

	// declaring the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating Scanner class object named sc inside the util package
		Scanner sc = new Scanner(System.in);

		// printing the statement
		System.out.println("-------------Enter Any String ---------------");

		// sc is created to reading the value from the user
		String s = sc.next();

		boolean check = palindromeCheck(s); // calling the method

		if (check) { // if starting

			// printing the Statement
			System.out.println("------------The Entered String is palindrome-------------");
			System.out.println("--------------------------------------------");
		} // end of the if

		else { // starting the else

			// Printing the statement
			System.out.println("-----------The entered String is not Palindrome-----------");
			System.out.println("-------------------------------------------------------------");
		} // end of the else

		sc.close(); // The close() method ofjava.util.Scanner class closes the scanner

	} // End of the main method

} // End of the Palindrome demo class
