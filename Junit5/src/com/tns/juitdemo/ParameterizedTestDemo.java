package com.tns.juitdemo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo
   {
	@ParameterizedTest //int--ints, String--strings, byte--bytes, char--chars
	@ValueSource(strings= {"1","2","three","four","five"})
	void withValueSource(String number)
	{
		assertNotNull(number);
	}
	@ValueSource(ints= {1,2,3,4})
	void withValueSource(int number)
	{
		assertNotNull(number);
	}
	}


