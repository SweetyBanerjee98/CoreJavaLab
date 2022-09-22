/*
Program :- Write a Java program to print the duplicate entries , Sort the arrayayay and then remove the duplicate entry. 
@Author :- Sweety Banerjee
Date :- 22sept 2022
Timing :- 4:00pm

*/


import java.util.Scanner; //Declaring the package
import java.util.Arrays; //declaring the package


class DuplicateArrayPrintRemove    //Declaring the DuplicatearrayPrintRemove class
{
	
	             /*-------------------------------------------------------------------------------------------*/
		       /*                        Method to remove duplicate arrayay                                      */
	/*-------------------------------------------------------------------------------------------------------------------------*/
	
	static void duplicatearrayRemove(int oldarray[]) //declaring the method & passing a argument
	
   {
	   
	   int arraySize= oldarray.length;
	   int new_arraySize;
	   if(arraySize==0||arraySize==1)
	   {
		   new_arraySize=arraySize;
	   }
	   
	   int tempVar[] = new int[arraySize]; //
	   int j=0;           // j will have the maximum element in the array
	   
	   for(int i=0;i<arraySize-1;i++) 
	   {
		   if(oldarray[i] != oldarray[i+1])
		   {
			   tempVar[j++] = oldarray[i];
		   }
	   }
	   tempVar[j++]=oldarray[arraySize-1];
	   
	   //changing original arrayay
	   for(int i=0; i<j;i++)
	   {
		   oldarray[i]= tempVar[i];
	   }
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(oldarray[i]+"  ");
	   }
   }
   
                  /*-------------------------------------------------------------------------------------------*/
		            /*                        Method to  Printing an arrayay                                      */
	     /*-------------------------------------------------------------------------------------------------------------------------*/
	
	
	static void arrayPrint() //declaring the arrayay print & sorting method
	{ //start method
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number of elements:");
		int rows= sc.nextInt();
		
		int array[]= new int[rows];
		
		System.out.println("Enter the elements of arrayay :");
		
		for(int i=0;i<rows;i++)
		{	
	     	array[i]= sc.nextInt();
		}
		
      
	   
	    // sorting the arrayay of Elements elements	
	      int n= array.length;
		   for(int i = 0;i<n-1;i++){
			   for(int j = 0;j<n-i-1;j++){
				   if(array[j] > array[j+1]){
					  int temp = array[j] ;
					  array[j] = array[j+1];
					  array[j+1] = temp; 
					   
				   }
				   
			   }
			   
		   }

		System.out.println(); //for new line
		
		System.out.println("arrayay elements after sorting"); //printing the statement
        arrayDisplay(array); //
		
		System.out.println();
		
		System.out.println("After removing Duplicate elements...");
        duplicatearrayRemove(array);
		
	}
	  
	             /*-------------------------------------------------------------------------------------------*/
		       /*                        Method to Displaing an arrayay                                      */
	        /*-------------------------------------------------------------------------------------------------------------------------*/
	
	 static void arrayDisplay(int oldarray[])
	{
		
		System.out.println();
	
		for(int myrow:oldarray)
		{
		 System.out.print(myrow+ "  ");		
		}
		
	}
	
	
//Declaring the main method
   public static void main(String args[])
   {
	  
    arrayPrint(); //calling the method
	
   } //Ending the main method

} //End of the class