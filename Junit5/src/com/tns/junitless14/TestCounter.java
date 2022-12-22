package com.tns.junitless14;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCounter 
{
	Counter counter1=new Counter();
	public TestCounter() {}//default constructor
	
	@Test
	public void Increment()
	{
		assertTrue(counter1.increment()==1);
		assertTrue(counter1.increment()==2);
	}
	
	@Test
	private void Decrement()
	{
		assertTrue(counter1.decrement() == -1);

	}
	

}
