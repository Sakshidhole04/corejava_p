//linkedlist
//iterator method

package com.java2.collection;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Prog5 
{
	public void Display(List<String> list)
	{
		Iterator<String> obj=list.iterator();
		while(obj.hasNext())
		{
			System.out.println("Element is: "+obj.next());
		}
	}
	

	public static void main(String[] args) 
	{
		LinkedList<String> obj=new LinkedList<>();
		obj.add("East");
		obj.add("West");
		obj.add("North");
		obj.add("South");
		
		System.out.println(obj);
		
		Prog5 p=new Prog5();
		p.Display(obj);
		

	}
}
