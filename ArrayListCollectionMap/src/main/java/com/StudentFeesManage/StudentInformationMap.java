/*
Program (2) :-Create  a HashMap to store the fees submitted by student .The key of the Map will be Student Id.
Create a method to find a student using the ID."
@Author:- Sweety Banerjee
#Date:- 26th Oct , 2022 
*/

package com.StudentFeesManage; // Defining public class StudentInformationMap

import java.util.HashMap;
import java.util.Scanner;

public class StudentInformationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, StudentDemo> stuInfo = new HashMap<>();

		String uniqueId; // Declaring variable unique id

		// creating scanner class object
		Scanner sc = new Scanner(System.in);

		// creating StudentDetails object
		StudentDemo sInfo = new StudentDemo();

		// start of Storing details in stuInfo hashmap object
		stuInfo.put("Swe101", new StudentDemo(101, "Sweety Banerjee", "Full Stack Java", 3550, "Payment Completed"));
		stuInfo.put("Pri102", new StudentDemo(102, "Priya Banerjee", "Architecture", 0000, "Not Paid"));
		stuInfo.put("Pin103", new StudentDemo(103, "Pinky Saha", "Python", 3550, "Payment Completed"));
		stuInfo.put("Chi104", new StudentDemo(104, "Chiranjeev Halder", "Economics", 2500, "Partially Paid"));
		stuInfo.put("Pari105", new StudentDemo(105, "Parijat Adhikary", "Law of Management", 2000, "Partially Paid"));
		stuInfo.put("Juh106", new StudentDemo(106, "Juhi Banerjee", "JQuery", 2300, "Partially Paid"));
		stuInfo.put("Abc107", new StudentDemo(107, "Rumpa Banerjee", "DBMS", 0000, "Not Paid"));
		stuInfo.put("Shu108", new StudentDemo(108, "Subham Banerjee", "Data Science", 1000, "Partially Paid"));
		stuInfo.put("Sou109", new StudentDemo(109, "Soumi das", " Software Technology", 0000, "Not Paid"));
		// end of Storing details in stuInfo hashmap object

		System.out.println("----Student  Payment Status Checking ------");

		System.out.println("Enter Student UniqueId :");
		uniqueId = sc.next(); // taking unique id of the student as an input from the user

		// check : Student is present in the map or not
		boolean status = stuInfo.containsKey(uniqueId);

		// displaying the information

		if (status) {

			System.out.println("----------- Student Information Found ------------------");
			sInfo = stuInfo.get(uniqueId);
			System.out.println(sInfo);

		}

		else {
			System.out.println("----------------Student Information Not Found-------------");
		}

		sc.close();

	}

}
