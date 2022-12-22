package com.tns.junitless14;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest 
{

	@Test
	public void testSay()
	{
		HelloWorld hello=new HelloWorld();
		assertEquals("Unexpected Result","Hello World!",hello.say());
	}

}
