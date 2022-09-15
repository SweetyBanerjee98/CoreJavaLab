/*
program :-Java progam to find whether the character entered is vowel ,consonant ,number and special character.
@Author :- Sweety Banerjee
@Lab Assesment :-  by SHURUTI SINGHAL Ma'am
@Date :- 15th september 2022 
*/

//declaring a class 
class VowelConsonantDemo
{
	//declaring static method of checkChar
	static void checkChar(char charValue)
	{
	
	
		int asciiValue= charValue;  //charValue is store in Asciivalue variable
		
		//if the given condition is true then if block will be execute otherwise ifelse block execute
		if((asciiValue>=65)&&(asciiValue<=90))  //  //if the range it's between 65 to 90 then its printing   
		{
			
			//if the given condition is true then if block will be execute otherwise else block execute
			if((charValue=='A')||(charValue=='E')||(charValue=='I')||(charValue=='O')||(charValue=='U')) //declaring the upper case vowel
			{
				System.out.println("Its a vowel"); //if char is vowel then printing its a vowel
			}
			else
			{
				System.out.println("Its a consonant"); //if char is consonant then printing its a consonant
			}	
			
		    
		}
		else if((asciiValue>=97)&&(asciiValue<=122))   //if the range it's between 97 to 122 then 
		{
			
			//if the given condition is true then if block will be execute otherwise else block execute
			if((charValue=='a')||(charValue=='e')||(charValue=='i')||(charValue=='o')||(charValue=='u'))  //declaring the lower case vowel
			{
				System.out.println("Its a vowel"); //if char is vowel then printing its a vowel
			}
			else
			{
				System.out.println("Its a consonant"); //if char is consonant then printing its a consonant
			}	
		}
		else if((asciiValue>=48)&&(asciiValue<=57)) //if the range it's between 48 to 57 then 
		{
			System.out.println("Its a number"); // then it's printing this statement
		}
		else
			System.out.println("Its a special character"); //Otherwise it's printing this statement
			 
		
	}
	
   public static void main(String args[]) //declaring the main method
   {
	  char value = args[0].charAt(0);// taking a character input
	   
	 		

	  checkChar(value); //calling the method
	  
    
    }

   // end of main

}

// end of VowelConsonantDemo class
