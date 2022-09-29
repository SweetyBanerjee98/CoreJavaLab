/*Program :- "Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class 'additionalAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank                
2 - having a parameter which is the amount that will be added to the Piggie Bank                
Create an object of the 'additionalAmount' class and display the final amount

@Author :- Sweety Banerjee
Date:- 29 september 2022
*/

package com.example; //declaring the package

public class AddAmount {
	// Declaring the instance variables
	private double initialAmount = 50; // initializing the value of these variable
	private double additionalAmount;
	private double finalAmount;

	// Default constructor
	public AddAmount() {

	}// end of default constructor

	// Parameterized constructor
	public AddAmount(double additionalAmount) {

		finalAmount = initialAmount + additionalAmount;
	} // end of parameterized constructor

	public void displayAmount() {
		// TODO Auto-generated method stub
		System.out.println("Final Amount: " + finalAmount);
	}

	// Create Getters and Setters method for each variable
	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public double getAddAmount() {
		return additionalAmount;
	}

	public void setAddAmount(double additionalAmount) {
		this.additionalAmount = additionalAmount;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	// overriding the toString() method
	@Override
	public String toString() {
		return "AddAmount [initialAmount=" + getInitialAmount() + ", additionalAmount=" + additionalAmount + "]";
	}

}// end of the class