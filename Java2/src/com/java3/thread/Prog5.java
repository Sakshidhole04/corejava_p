//blocked or waiting state
package com.java3.thread;

class Eclipsee1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse thread id is "+Thread.currentThread().getId());
		try 
		{
			sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	}
}
public class Prog5 {

	public static void main(String[] args)
	{
		Eclipsee1 obj =new Eclipsee1();
		obj.start();
		
	}

}

