/*
Program :- Write a program to print sum of even and odd numbers using varargs.
@Author :- Sweety Banerjee
Date:- 29 september 2022
*/

//declaring the package
package com.example;

//declaring the class
public class OddEvenSum {

	// declating the method passing an parameter
	public static int EvenSum(int... a) {
		int EvenSum = 0; // initializing the 0 value with even sum variable

		// enhanced for loop
		// iterating through each element of the array
		for (int i : a) { // a value
			if (i % 2 == 0) { // Check if the remainder of number 2 becomes zero then show even numbers
				EvenSum += i; // incrementing
			}
		}
		return EvenSum; // returning
	}

	// declating the method passing an parameter
	public static int OddSum(int... a) {

		int OddSum = 0;// initializing the 0 value with even sum variable

		// enhanced for loop
		// iterating through each element of the array
		for (int i : a) {
			if (i % 2 != 0) { // Check if the remainder of number 2 becomes zero then show even numbers
								// otherwise show odd numbers
				OddSum += i;// incrementing
			}
		}
		return OddSum;// returning
	}

	// declaring the main method
	public static void main(String... args) {

		// TODO Auto-generated method stub

		// printing the sum of odd numbers and even numbers
		System.out.println("Sum of even Numbers: " + EvenSum(2, 6, 9, 7, 45, 77, 40, 22, 10, 66, 84));
		System.out.println("Sum of odd Numbers: " + OddSum(2, 6, 9, 7, 45, 77, 40, 22, 10, 66, 84));

	}// end of the main method
}// end of the class
