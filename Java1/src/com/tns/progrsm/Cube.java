//final keywoerd
//cannot be override final class and final mehod
//ex: Adhar card 
package com.tns.progrsm;

class Main
{
	final void disp()
	{
		System.out.println("myself sakshi");	
	}
	void disp1()
	{
		System.out.println("I m from batch B47");
	}
}
public class Cube extends Main
{
//	void disp()
//	{
//		System.out.println("myself sakshi");	
//	}
	public static void main(String[] args)
	{
		Cube c1=new Cube();
		c1.disp();
		c1.disp1();

	}

}
