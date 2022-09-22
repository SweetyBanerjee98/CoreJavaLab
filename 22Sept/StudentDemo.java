/*
Program :-  Write a Student and create an array of 10 students and display the students whose marks are more than 90%. 
@Author :- Sweety Banerjee
Date :- 22sept 2022
Timing :- 4:00pm

*/

import java.util.*;

class StudentDemo
{
	String studentName;
	int studentId;
	float totalPercentage;
	
	Student(String studentName, int studentId, float totalPercentage)
	{
		this.studentName = studentName;
		this.studentId = studentId;
		this.totalPercentage = totalPercentage;
	}
	
	vostudentId display()
	{
		System.out.println(""+studentName);
		System.out.println(""+studentId);
		System.out.println(""+totalPercentage);
	}
	
	public static vostudentId main(String args[])
	{
		Student[] s = new Student[3];
		Scanner sc = new Scanner(System.in);
       
        for(int i = 0; i < 3; i++)
		{
            System.out.print("studentName: ");
            String studentName = sc.next();
			
            System.out.print("studentId: ");
            int studentId = sc.nextInt();
			
            System.out.print("Percentage: ");
            float totalPercentage = sc.nextFloat();
			
            s[i] = new Student(studentName, studentId, totalPercentage);
        }
		
        for(int i = 0; i < s.length; i++)
		{	
			if(s[i].totalPercentage >= 90)
			{
				s[i].display();
			}
        }
		
	}
}