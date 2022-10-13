/*
Program (1) :- Create a Thread Using Lambda
@Author:- Sweety Banerjee
#Date:- 13th Oct , 2022 
*/

package com.question1; //declaring the package

public class ThreadLambda { // declaring the class

	public static void main(String[] args) { // declaring the main method
		// TODO Auto-generated method stub

		// Thread without lambda
		Runnable r1 = new Runnable() { // creating object of class Runnable
			@Override // overriding method run
			public void run() { // starting
				System.out.println(Thread.currentThread().getName() + " : thread is running"); // writing custom code in
																								// overridden method
			} // end of the run method
		};

		Thread t1 = new Thread(r1, "Sweety"); // creating thread 1 by creating object of class Runnable
		System.out.println(" Without Lambda----------- "); // printing the statement
		t1.start(); // starting execution of thread 1 by calling the start method of class Thread

		/* <------------------------------------------------------------------> */

		// Thread with lambda
		Runnable r2 = () -> { // creating object of class Runnable
			System.out.println(Thread.currentThread().getName() + " : thread is running"); // printing the statement
		};
		Thread t2 = new Thread(r2, "Juhi123"); // creating thread 1 by creating object of class Runnable
		System.out.println(" With Lambda------------------ "); // printing the statement
		t2.start(); // starting execution of thread 2 by calling the start method of class Thread

	} // end of the main method

} // end of the class
