package com.tns.junitless14;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestStudent
{
	@Test
	public void GetRollNo()
	{
		Student s=new Student(100,"sam","dcosta");
		assertEquals(s.getRollNo(),100);
	}
	@Test
	public void GetFirstName()
	{
		Student s=new Student(100,"sam","dcosta");
		assertEquals(s.getFirstName(),"sam");
	}
	@Test
	public void GetLastName()
	{
		Student s=new Student(100,"sam","dcosta");
		assertEquals(s.getLastName(),"dcosta");
	}

}
