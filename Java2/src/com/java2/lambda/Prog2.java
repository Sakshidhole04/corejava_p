//using lambda expression

package com.java2.lambda;

interface Seltos
{
	public void display();
}

//class Sonet implements Seltos
//{
//	public void display()//cut modifier return type and method name
//	{
//		System.out.println("calling display method..");
//	}
//}
public class Prog2 {

	public static void main(String[] args) 
	{
		//Seltos s=new Sonet();
		
		Seltos s=()->System.out.println("calling display method..");//no need to write implemented class
		s.display();


	}

}
