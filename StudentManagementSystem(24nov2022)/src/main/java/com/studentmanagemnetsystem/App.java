/*
Program: Student Management System
@author: Sweety Banerjee
@Date: 24th November 2022
 */
package com.studentmanagemnetsystem; //declaring a package
 
 //importing
import java.util.List;

import com.dao.StudentDao;
import com.entity.Course;
import com.entity.Student;

//  declaring App class
public class App 
{
	// declaring main method
    public static void main( String[] args ){
        
    	//creating student and course object and passing the values
    	Student student1= new Student("Sweety","Banerjee","banerjeesweety98@gmail.com");
    	Course course1= new Course("MCA");
    	course1.setStudent(student1);
    	student1.setCourse(course1);
    	
    	//creating student and course object and passing the values
    	Student student2= new Student("Juhi","Banerjee","juhibanerjee12345@gmail.com");
    	Course course2= new Course("BSC");
    	course2.setStudent(student2);
    	student2.setCourse(course2);
    	
    	//creating StudentDao object and calling methods
    	StudentDao studentDao= new StudentDao();
    	studentDao.saveStudent(student1);
    	studentDao.saveStudent(student2);
    	studentDao.deleteStudent(1);
    	
    	//creating student list 
    	List<Student> students = studentDao.getAllStudent();
        students.forEach(studentTemp -> System.out.println(studentTemp.getFirstName()));
    }
}
