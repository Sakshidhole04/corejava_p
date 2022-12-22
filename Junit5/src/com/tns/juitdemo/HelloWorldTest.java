package com.tns.juitdemo;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifecycleLogger
{
	@Test
	@RepeatedTest(10)
	
	public void test()
	{
		System.out.println("first test case");
	}

	
}
