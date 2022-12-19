//labda expression is assosiated with functional interface
//where we saw the functional interface we can use lambda expression
package com.java2.lambda;
@FunctionalInterface
interface Cab
{
	public void BookCab();  //only one abstract method

}
class Ola implements Cab
{
	public void BookCab()//defining the absract method by implementing the class 
	{
		System.out.println("ola book cab");
	}
}


public class Prog1 {

	public static void main(String[] args) 
	{
		//Ola cab=new Ola();
		Cab cab=new Ola();
		cab.BookCab();
	}

}
