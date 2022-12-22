package com.tns.junitless14;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingTest 
{
	
	@Test
	public void testGreet()
	{
		Greeting greeting=new Greeting();
		assertEquals("Unexpected results","welcome to java",greeting.greet());
	}

}
