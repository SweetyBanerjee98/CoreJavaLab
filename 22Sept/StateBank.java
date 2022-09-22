
/*
Program :-  Write a  java program to create a BankAccount and display the people with accountBalance less than 1000./*
@Author :- Sweety Banerjee
Date :- 22sept 2022
Timing :- 4:00pm

*/

//declaring class StateBank

class StateBank
{
	
	// calling the main method
	public static void main(String...args){
		// Creating an array of BankAccounts
		BankAccount StateBank1[]=new BankAccount[6];
		
		// Constructor injection
		StateBank1[0]=new BankAccount(1344,"Sweety",78000);
		StateBank1[1]=new BankAccount(5667,"Juhi",45000);
		StateBank1[2]=new BankAccount(8899,"Priya",5670);
		StateBank1[3]=new BankAccount(7888,"Pinky",7896);
		StateBank1[4]=new BankAccount(6777,"qwerty",234);
		StateBank1[5]=new BankAccount(8896,"rtyh",780);
		
		
		// the loop StateBank array 
		for(int i=0;i<StateBank1.length;i++){
			
			// storing the amount in an variable
			double amount=StateBank1[i].getaccountBalance();
			
			// if amount is less than 1000 then 
			if(amount<1000){ //condition check
			
				// printing  the BankAccount details
				System.out.println("BankAccount "+i);
				System.out.println("The BankAccount number is : "+StateBank1[i].getaccountNumber());
				System.out.println("The BankAccount name is : "+StateBank1[i].getaccountName());
				System.out.println("The BankAccount balance is : "+StateBank1[i].getaccountBalance());
			} // if ends 
			
		} //ends of  for  loop
		
	} //End of the main method  
	
}// end of the StateBank class  