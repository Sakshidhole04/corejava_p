//combination of collection with generics
package com.java2.generics;


import java.util.LinkedList;
import java.util.List;

class Data1<T>
{
	private T myVariable;

	public Data1(T myVariable) 
	{
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() 
	{
		return myVariable;
	}

	public String toString()
	{
		return "Data [myVariable=" + myVariable + "]";
	}
}

public class Prog2 {

	public static void main(String[] args)
	{
		List<String> obj=new LinkedList<>();
		obj.add("hello");
		obj.add("Batch");
		obj.add("b37");
		obj.add("Ap");
		obj.add("program");
		System.out.println(obj);
		
		List<Integer> obj1=new LinkedList<>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		System.out.println(obj1);
		
		List<Float> obj3=new LinkedList<>();
		obj3.add(10.1f);
		obj3.add(2.5f);
		obj3.add(3.8f);
		obj3.add(4.9f);
		System.out.println(obj3);
		
		List<Data1<Object>> obj2=new LinkedList<>();
		obj2.add(new Data1<Object>("hello"));
		obj2.add(new Data1<Object>("batch"));
		obj2.add(new Data1<Object>("B37"));
		
		System.out.println(obj2);
		
		List<Data1<String>> obj4=new LinkedList<>();
		obj4.add(new Data1<String>("hello"));
		obj4.add(new Data1<String>("batch"));
		obj4.add(new Data1<String>("B37"));
		
		System.out.println(obj4);

	}

}
