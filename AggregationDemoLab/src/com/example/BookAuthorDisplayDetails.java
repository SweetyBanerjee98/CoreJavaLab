/*
Program :- Write a program to show aggregation of a book and author class
@Author :- Sweety Banerjee
Date:- 29 september 2022
*/

package com.example; //declaring the package

//declarig the class
public class BookAuthorDisplayDetails {

	// declaring the display method
	static void display(Book b) {

		System.out.println(b); // printing b

	}

	// declaring the main method
	public static void main(String[] args) {

		// Constructor Injection
		Book b1 = new Book(12345, "Good Vibes Good Lifes", 320, new AuthorDemo("Vex king", 45, "Kolkata", "India"));

		Book b2 = new Book(3456, "East of Eden", 700, new AuthorDemo("John Steinbeck", 67, "Mumbai", "India"));

		System.out.println("Book Details are :"); // printing the statement

		display(b1); // calling s1
		display(b2);// calling s2

	}// end of the class

}
