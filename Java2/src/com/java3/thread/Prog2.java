package com.java3.thread;

class Eclipse1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse thread id is "+Thread.currentThread().getId());
		}
	}
}

public class Prog2 {

	public static void main(String[] args)
	{
		Eclipse1 obj=new Eclipse1();
		obj.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread id is "+Thread.currentThread().getId());
		}

	}

}
