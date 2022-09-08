/* 
program : Write a java program to calculate simple interest(SI=P*R*T) Time is 5
@Author :- Sweety Banerjee
@Lab Assesment :-  by SHURUTI SINGHAL Ma'am
@Date :- 8th september 2022
*/

// Declaring a class
class SimpleInterestDemo1
{
	
	
	// calling the main method
	public static void main(String[] args)
	{
		float principalAmount= Float.parseFloat(args[0]);// taking input 
		float Rate=Float.parseFloat(args[1]);// taking input 
		int time=5;
		                                                         
		float simpleInterset = (principalAmount*Rate*time)/100;  //calculate the simple interest
		
		System.out.println("The Simple Interest is : "+simpleInterset); //print simple ineterest 
	}
	// End of the main Method
}

// // End of the java  SimpleInterest class