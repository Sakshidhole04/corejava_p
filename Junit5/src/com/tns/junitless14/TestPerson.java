package com.tns.junitless14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class TestPerson
{
	@Test
	public void GetFullName()
	{
		System.out.println("from TestPerson1");
		Person per=new Person("Robert","King");
		assertEquals("Robert King",per.getFullName());
	}
	@Test
	public void NullsInName()
	{
		System.out.println("from TestPerson1");
		Person per1=new Person("Robert","King");
		assertNotNull("full name null",per1.getFirstName());
		assertNotNull("full name null",per1.getFullName());
	}
	@Test
	public void GetFirstName()
	{
		Person p=new Person("Robert","King");
		assertEquals(p.getFirstName(),"Robert");
	}
	@Test
	public void testGetLastName()
	{
		Person p=new Person("Robert","King");
		assertEquals(p.getLastName(),"King");
	}
	

}
