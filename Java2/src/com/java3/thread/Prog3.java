//multithreading
//Runnable 
//weather we use runnable interface or extends or implements keyword the out output is keep changing
package com.java3.thread;

class Eclipse2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse thread id is "+Thread.currentThread().getId());
		}
	}
}

public class Prog3 {

	public static void main(String[] args)
	{
		Eclipse2 obj=new Eclipse2();
		Thread obj1=new Thread(obj);
		obj1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread id is "+Thread.currentThread().getId());
		}

	}

}
