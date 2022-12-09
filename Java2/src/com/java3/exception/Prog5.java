//throws == using this keyword we can generate multiple exception
package com.java3.exception;

import java.io.IOException;

public class Prog5
{
	void m1()
	{
		System.out.println("no exception");
	}
	void m2() throws IOException
	{
		throw new IOException("device error or exception may happen");
	}
	void m3() throws ArithmeticException,IOException,ClassNotFoundException
	{
		throw new IOException("device error or exception may happen"); 
	}

	public static void main(String[] args)
	{
		

	}

}
