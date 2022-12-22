package com.tns.junitless14;

public class Student {

	int rollNo;
	String firstName;
	String lastName;
	Student(int rollNo,String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.rollNo=rollNo;
	}
int getRollNo()
{
	return rollNo;
}
String getFirstName() {
	return firstName;
}
String getLastName()
{
	return lastName;
}

}
