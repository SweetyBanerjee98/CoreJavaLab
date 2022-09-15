/*
program :- Java Program to Print a Pattern
       *
	  * *
	 * * *
	* * * * 
@Author :- Sweety Banerjee
@Lab Assesment :-  by SHURUTI SINGHAL Ma'am
@Date :- 15th september 2022 
*/

//declaring a class
class StarPatternDemo
{
	
	//declaring static method of starPattern
	static void starPattern(int noOfRows)
	{
		//outer loop of starPattern rows
		for(int i=1;i<=noOfRows;i++) 
		{
			System.out.println();   //create new line after each row
			
			//inner loop of starPattern 
			for(int space=noOfRows; space>i; space--)
			{
				
				System.out.print(" ");   //printing The space 
			}
			//end of inner loop
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* "); //printing starPattern
			}
			
			
		}
		//end of the Outer loop
		
		
	}
	//end of the atarPattern method 
	
	
	
	//calling main
    public static void main(String... args)
	{
	  int number =Integer.parseInt(args[0]);  //taking input from the user
	  starPattern(number);    // calling the method
	}
	//end of main
	
}
//end of class StarPatternDemo