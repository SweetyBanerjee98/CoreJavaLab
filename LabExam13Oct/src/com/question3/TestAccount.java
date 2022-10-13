/*
Program (3) :- Create a Account and perform synchronized withdrawal in it using Threads
@Author:- Sweety Banerjee
#Date:- 13th Oct , 2022 
*/
package com.question3; //declaring the package

public class TestAccount extends Thread { // Creating the class and extends with thread class

	Account acc = new Account(); // Creating the object

	public static void main(String[] args) { // Declaring the main method
		// TODO Auto-generated method stub

		TestAccount acc = new TestAccount(); // creating the object
		Thread t1 = new Thread(acc, "Sweety"); // Passing the object to Thread class constructor
		Thread t2 = new Thread(acc, "Juhi");

		t1.start(); // the start() method moves the t1 thread to the active state
		t2.start(); // the start() method moves the t2 thread to the active state

	} // End of the class

	synchronized void MakeWithDrawl(int amt) { // creating method MakeWithDrawl

		if (acc.getBalance() >= amt) { // checking if account balance is greater than withdraw amount
			// if true
			System.out.println(Thread.currentThread().getName() + " amount is wihtdrawing: " + amt);
			try {
				Thread.sleep(500); // stoping execution of this thread for 500 miliseconds
			} catch (InterruptedException e) { // catching exception
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withDrawl(amt); // calling the method withDrawl of class object acc to withdraw the balance
			System.out.println(Thread.currentThread().getName() + " is wihtdrawl amount : " + amt);
		} else {
			// if false
			System.out.println(Thread.currentThread().getName() + " is not having enough balance"); // printing not
																									// enough
			// balance to console
			System.out.println("The amount is " + acc.getBalance()); // letting the user know of their current balance

		} // end of if
	} // End of the synchronized method

	public void run() { // starting the run method
		MakeWithDrawl(700); // calling the method MakeWithDrawl for amount 700
		if (acc.getBalance() < 0) { // checking if the user has 0 balance
			// if true
			System.out.println("Balance is overdrawn"); // letting the user know that all balance has been withdrawn

		} // End of if
	} // End of the run method
} // End of the class
