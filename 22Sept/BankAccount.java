/*
Program :-  Write a  java program to create a BankAccount and display the people with accountBalance less than 1000./*
@Author :- Sweety Banerjee
Date :- 22sept 2022
Timing :- 4:00pm

*/

import java.util.Scanner;
//declaring a class Account

class BankAccount
{
	//declaring instance variable
	
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	//default constructor no arg constructor
    BankAccount()
	{
		
	}
	
	//parameterized constructor
	BankAccount(int accountNumber,String accountName,double accountBalance)
	{
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.accountBalance=accountBalance;
		
	}
	
		
	
	//getters(accessors) and setters(mutators)
	public int getaccountNumber()
	{
		return this.accountNumber;
	}
	
	public void setaccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}

	/*-------------------------------------------------------------------------------------------------------------------------*/
	public String getaccountName()
	{
		return this.accountName;
	}
	
	public void setaccountName(String accountName)
	{
		this.accountName=accountName;
	}
	
	/*--------------------------------------------------------------------------*/
	public double getaccountBalance()
	{
		return this.accountBalance;
	}
	
	public void setaccountBalance(long accountBalance)
	{
		this.accountBalance=accountBalance;
	}
}
