/*
program :- To Print java Program To Find The Quotient & Remainder(Take input From User)
@Author :- Sweety Banerjee
@Lab Assesment :-  by SHURUTI SINGHAL Ma'am
@Date :- 8th september 2022
*/

// Declaring the class here
class QuotientRemainderDemo
{
public static void main(String args[])     //Calling The Main Method

{
	
        float divisor= Float.parseFloat(args[0]); // taking input 
		float dividend= Float.parseFloat(args[1]); // taking input 
		
		
		float quotient=dividend/divisor;
		
		
		int reminder= (int) (dividend%divisor);
		
		System.out.println("the Quotient is :"+quotient); // printing java quotient value
		System.out.println("The Reminder is :"+reminder); // printing java reminder value

} // End of the main Method


} // End of the java QuotientRemainderDemo class