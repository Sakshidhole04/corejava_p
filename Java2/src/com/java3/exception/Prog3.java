//ArithmeticException
//try multiple catch = when we have more than one type of exception
package com.java3.exception;

public class Prog3 {

	public static void main(String[] args)
	{
		int a[]=new int[4];
		try 
		{
			a[9]=50/0;
		} 
		catch (ArithmeticException e) 
		{
			
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		System.out.println("I am the last line");
		

	}

}
