
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

package com.demo; //declaring the package

public class DetailsDemo { // declaring the class

	// declaring the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// assign subclass reference to subclass variable
		Area ar = new Area();

		// Set data in Area's object
		ar.RectangleArea(43.7f, 7.8f);

		ar.SquareArea(33.7f);

		ar.CircleArea(6.9f);

	} // end of the main method

} // end of the DetailsDemo Class
