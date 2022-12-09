//ArrayIndexOutOfBoundsException
//finally
package com.java3.exception;

public class Prog2 {

	public static void main(String[] args)
	{
		int []a=new int[4];
		System.out.println("welcome to batch B37");
		try 
		{
			//int i=a[9];
			int i=a[3];
			System.out.println(i);
		}
//		catch (ArrayIndexOutOfBoundsException e) 
//		{
//			e.printStackTrace();
//		}
		finally 
		{
			System.out.println("printed anyhow ");
			System.out.println("GE");
		}
       System.out.println("batch B37");
	}
	

}
