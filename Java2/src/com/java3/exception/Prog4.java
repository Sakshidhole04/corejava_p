//throw = is use to generate the exception
package com.java3.exception;

public class Prog4 
{
	void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) 
	{
		Prog4 p4=new Prog4();
		p4.validate(22);
		System.out.println("batch b37");

	}

}
