
/*
 Program : We have to calculate the area of a rectangle, a square and a circle.
 Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
 taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
 The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' 
 is its side and that of 'CircleArea' is its radius. Now create another class 'Area'
 containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea'
 for printing the area of rectangle, square and circle respectively.
 Create an object of class 'Area' and call all the three methods.
 
 @author : Sweety Banerjee
 Date: 7/10/2022
 */

package com.demo;// declaring the package

//declaring class Area 
public class Area extends Shape { // Area class access all the properties of shape class

	// Declaring the variale area & initializing with 0 value
	double Area = 0;

	@Override
	void RectangleArea(float height, float width) { // declaring the method with parameterlists
		// TODO Auto-generated method stub

// Calculate the area of the rectangle by multiplying the width and height of the rectangle

		Area = height * width; // Assign the area of the rectangle to the area variable
		System.out.println(" " + Area); // printing the area value

	} // end of the method

	@Override
	void SquareArea(float side) { // declaring the method
		// TODO Auto-generated method stub

		// Calculating the area of the square by squaring any of the side of that square
		Area = Math.pow(side, 2);
		System.out.println(" " + Area); // printing the value

	} // end of the Square area method

	@Override
	void CircleArea(float radius) { // declaring the method
		// TODO Auto-generated method stub

		double pi = 3.14; // initializing the value to the variable pi

// Calculating the area of a circle by multiplying pi with square of radius of the circle
		Area = pi * Math.pow(radius, 2);
		System.out.println(" " + Area); // printing the area value

	} // end of the Circlearea method

} // end of the class area
