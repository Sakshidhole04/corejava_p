//Exception
package com.java3.exception;

public class Prog1 {

	public static void main(String[] args)
	{
	int numone=50/5;
	System.out.println(numone);
	
	int numtwo=50/10;
	System.out.println(numtwo);
	
	try 
	{
		int numthree=50/0;
		System.out.println(numthree);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
	int numfour=50/25;
	System.out.println(numfour);

	}

}
