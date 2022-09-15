/* 
Program:Write a java program to print the tagline of any 5 companies (Enhanced switch case).
@Author :- Sweety Banerjee
@Lab Assesment :-  by SHURUTI SINGHAL Ma'am
@Date :- 15th september 2022 
*/

import java.util.Scanner;  //importing the required class


class EnhancedSwitchCaseDemo   //Declaring the class 
{
	//Calling The Main Method
	public static void main(String args[])     
	{
		System.out.println("Enter the name of the company "); //Choose any Company
		Scanner sc = new Scanner(System.in);  //creating Scanner class Object inside the util package
		String company = sc.next();     // The Entered company store in this company variable & sc is created to reading the value from the user
		
		
		//Starting the Enhanced Switch-Case conditions
		switch (company) //The company is evaluated once and compared with the values of each case
		{
			
			//If Apple is matching then the code of case apple are executed. Similarly, the code of case KFC  is executed if expression matches with KFC. and so on
		case "Apple" -> System.out.println("This is my favourite companie where "+company+". I will like to visit the office at least once in my life."); // if matching then printing the statement
		case "KFC" -> System.out.println("One of my favourite companies is "+company+". I love to Eat food at KFC "); // if matching then printing the statement
		case "Canon" -> System.out.println(" My favourite companie is "+company+" .I really love this product's camera quality. "); // if matching then printing the statement
		case "Audi" -> System.out.println("One of my favourite companies is "+company+". My favourite car company"); // if matching then printing the statement
		case "Facebook" -> System.out.println("One of my favourite companies is "+company+". I spent A lot of time here"); // if matching then printing the statement
		default -> System.out.println("Please Enter a valid company name"); // If nothing is to matching then this statement is print
		}
	}//end of main
	
}//end of class EnhancedSwitchCaseDemo