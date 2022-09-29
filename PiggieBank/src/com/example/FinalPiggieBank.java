package com.example;

//It reads input from the user,and pass the input stream (System.in) in the constructor of Scanner class
import java.util.Scanner;

//FinalPiggieBank class extends the addamount class
public class FinalPiggieBank extends AddAmount {

	// declaring the main method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		AddAmount a = new AddAmount(sc.nextDouble());
		a.displayAmount();

		char choice;// Declaring the choice variable

		// if true then loop body statement will be executed
		while (true) {
			System.out.println("Add Another Amount "); // printing the statements
			choice = sc.next().toLowerCase().charAt(0); // user input
			if (choice == 'y') {
				System.out.println("Enter the amount Again: ");
				double money;
				money = sc.nextDouble();
				money += a.getFinalAmount();
				a.setFinalAmount(money);
				System.out.println(money);

			}

			else {
				break;
			}
		}

	}
}
