//unboxing
package com.java3.wrapper;

public class Prog2 {

	public static void main(String[] args)
	{
		//double
		Double d1=Double.valueOf(56);
		double d2=d1;
		System.out.println(d2);
		
		//integer
		Integer I =Integer.valueOf(2);
		int i=I;
		System.out.println(i);
		
		//float
		Float F=Float.valueOf(10);
		float f=F;
		System.out.println(f);
		
		//byte
		Byte B=Byte.valueOf((byte) 10);
		byte b=B;
		System.out.println(b);
		
		//character
		Character C=Character.valueOf('a');
		char c=C;
		System.out.println(c);
		
	   //Boolean
		Boolean B1=Boolean.valueOf(false);
		boolean b1=B1;
		System.out.println(b1);
		
	}

}
