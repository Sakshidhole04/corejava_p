package com.tns.juitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo
   {
	@Disabled
	@Test
	public void simple()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}
	@Test
	public void simple1()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}
	@Test
	public void simple2()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}

	
	}


