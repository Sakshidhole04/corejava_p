//linkedlist
//iterator method
//has three method hasnext next and remove method method
package com.java2.collection;

import java.util.List;
import java.util.ListIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Prog6 
{
	public void Display(List<String> list)
	{
		ListIterator<String> obj=list.listIterator();
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
		
		obj.sort(null);
		
		
		Prog6 p=new Prog6();
		Collections.reverse(obj);
		p.Display(obj);
		System.out.println("****************");
		obj.sort(null);
		p.Display(obj);
		

	}
}

