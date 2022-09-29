/*
Program :- Write a program to show aggregation of a book and author class
@Author :- Sweety Banerjee
Date:- 29 september 2022
*/

package com.example; //declaring the package

//declarig the class
public class AuthorDemo {

	// declaring the instace variable
	private String authorName;
	private int age;
	private String place;
	private String country;

	// Declaring a default Constructor
	public AuthorDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	// declaring a parameterized Constructor
	public AuthorDemo(String authorName, int age, String place, String country) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
		this.country = country;
	}

	// using Getters and Setters
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AuthorDemo [authorName=" + authorName + ", age=" + age + ", place=" + place + ", country=" + country
				+ "]";
	}

}
