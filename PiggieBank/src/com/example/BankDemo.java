package com.example; //declaring the package

//It reads input from the user,and pass the input stream (System.in) in the constructor of Scanner class
import java.util.Scanner;

//Bank demo class extends the addamount class
public class BankDemo extends AddAmount {

	// declaring the main method
	public static void main(String args[]) {

		// declaring the scanner class object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount : "); // printing
		AddAmount a = new AddAmount(sc.nextDouble());
		a.displayAmount();

		char choice; // Declaring the choice variable

		// if true then loop body statement will be executed
		while (true) {

			System.out.println(" Add another amount : "); // printing these statement
			choice = sc.next().toLowerCase().charAt(0); // input from the user

			// if choice yes the these statements executed
			if (choice == 'y') {
				System.out.println("Enter the amount you want to add again: "); // printing these statements

			}
		}

	}// end of the main method
}// end of the class
