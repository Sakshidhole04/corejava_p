//threading
package com.java3.thread;

class Eclipse extends Thread
{
	public void  run()
	{
		System.out.println("Eclipse Thread Id is "+Thread.currentThread().getId());
	}
}
class Sketchbook extends Thread
{
	public void run()
	{
		System.out.println("Sketchbook Thread Id is "+Thread.currentThread().getId());
	}
}
class Chrome extends Thread
{
	public void run()
	{
		System.out.println("Chrome Thread Id is "+Thread.currentThread().getId());	
	}
}
class Calender extends Thread
{
	public void run()
	{
		System.out.println("Chrome Thread Id is "+Thread.currentThread().getId());	
	}
}
public class Prog1{

	public static void main(String[] args) 
	{
		Eclipse obj=new Eclipse();
		obj.start();
		
		Sketchbook obj1=new Sketchbook();
		obj1.start();
		
		Chrome obj2=new Chrome();
		obj2.start();
		
		Calender obj3=new Calender();
		obj3.start();
		
		System.out.println("Main Thread Id is "+Thread.currentThread().getId());

	}

}
