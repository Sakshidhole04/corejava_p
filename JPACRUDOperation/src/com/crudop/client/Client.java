package com.crudop.client;

import com.crudop.entities.Student;
import com.crudop.service.StudentService;
import com.crudop.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args)
	{
		
		StudentService service =new StudentServiceImpl();
		
		Student student =new Student();
		//create operation
		student.setStudentid(100);
		student.setName("Sachin");
		service.addStudent(student);
	
//    //retrieve operation
	student =service.findStudentById(100);
    System.out.println("ID:"+student.getStudentid());
    System.out.println("Name:"+student.getName());
    
//    //update operation
    student =service.findStudentById(100);
    student.setName("Sachin Tendulkar");
    service.updateStudent(student);
//    
    student =service.findStudentById(100);
    System.out.println("ID:"+student.getStudentid());
    System.out.println("Name:"+student.getName());
//    
//    //delete operation
    student=service.findStudentById(100);
    service.removeStudent(student);
    System.out.println("End of program/life cycle completed..");
    
}
}
