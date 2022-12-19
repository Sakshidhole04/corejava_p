//method with parameters

package com.java2.lambda;

interface BMW
{
	public void bookBMW(String source,String destination);
}
//class Breza implements BMW
//{
//	public void bookBMW(String source,String destination)cut modifier return type method name and type of variable
//	{
//		System.out.println("book BMW from "+source+" to "+destination );
//	}	
//}

public class Prog3 {

	public static void main(String[] args) 
	{
//		BMW b=new Breza();
		BMW b=(source,destination)->System.out.println("Book BMW from "+source+" to "+destination );
		b.bookBMW("banglore","hydrabad");


	}

}
