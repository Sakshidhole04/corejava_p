package com.tns.juitdemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {


		@Test
		void testOnDev()
		{
			System.getProperty("ENV","DEV");
			Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		}
		@Test
		void testOnPROD()
		{
			System.getProperty("ENV","PROD");
			Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")),AssumptionDemo::message);
		}
		/*@Test
		void testOnPROD()
		{
			System.getProperty("ENV","PROD");
			Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")),AssumptionDemo::message);
		}*/
		/*@Test
		void testOnPROD()
		{
			System.getProperty("ENV","PROD");
			Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),AssumptionDemo::message);
		}*/
		
		private static String message()
		{
			return "Test execution failed::";
		}

	}


