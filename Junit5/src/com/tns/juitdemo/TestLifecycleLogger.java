package com.tns.juitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
interface TestLifecycleLogger
{
	@BeforeAll
	default void beforAllTests()
	{
		System.out.println("Before all tests");
	}
	@AfterAll
	default void afterAllTests()
	{
		System.out.println("After all tests");
	}
}