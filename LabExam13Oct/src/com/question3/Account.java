
package com.question3; //Declaring the package

public class Account { // creating class Account

	private int balance = 1500; // declaring private variable with initial value 1500

	public int getBalance() { // defining method to get a user balance
		return balance; // returning the balance
	} // end of the method

	public void withDrawl(int amount) { // defining method to withdraw amount and updating the user balance
		balance = balance - amount; // total balance - amount
	} // End of the Method

} // End of the Class Account
