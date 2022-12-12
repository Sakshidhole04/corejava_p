//Priority for threads
//3 types of priority = max, min, norm  
//after using setting Priority also the thread sequence keeps on changing it is dynamic
//thread priority is dynamic

package com.java3.thread;

class Eclipsee extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse thread id is "+Thread.currentThread().getId());
		}
	}
}
public class Prog4 {

	public static void main(String[] args)
	{
		Eclipsee obj =new Eclipsee();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj.start();
		
		Eclipsee obj1 =new Eclipsee();
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj1.start();
		
		Eclipsee obj2 =new Eclipsee();
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj2.start();

	}

}
