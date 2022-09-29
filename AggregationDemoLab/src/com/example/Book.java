/*
Program :- Write a program to show aggregation of a book and author class
@Author :- Sweety Banerjee
Date:- 29 september 2022
*/

package com.example; //declaring the package

//declarig the class
public class Book {

	// declaring the instance variable
	private int serialNo;
	private String bookName;
	private double bookPrice;
	private AuthorDemo authordemo;
	// aggregation: weak assocition
	// private final Book; // composition: strong

	// Declaring a default Constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}// end of default constructor

	// declaring a parameterized Constructor
	public Book(int serialNo, String bookName, double bookPrice, AuthorDemo authordemo) {
		super();
		this.serialNo = serialNo;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authordemo = authordemo;
	} // end of parameterized constructor

	// Create Getters and Setters method for each variable
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public AuthorDemo getauthordemo() {
		return authordemo;
	}

	public void setauthordemo(AuthorDemo authordemo) {
		this.authordemo = authordemo;
	}

	// overriding the toString() method
	@Override
	public String toString() {
		return "Book [serialNo=" + serialNo + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authordemo="
				+ authordemo + "]";
	}

}
