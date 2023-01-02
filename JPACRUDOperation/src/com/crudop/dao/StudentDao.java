package com.crudop.dao;

import com.crudop.entities.Student;
public interface StudentDao 
{
	public abstract Student getStudentById(int Id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	void updateStudent();

}
