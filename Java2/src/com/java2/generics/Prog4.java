/*by using single method in genric you 
 can call different different datatype*/
package com.java2.generics;

import java.util.ArrayList;
import java.util.List;

class Data3
{
	public <E> void printListData(List<E> obj1)
	{
		for(E i: obj1)
		{
			System.out.println(i);
		}
	}
	public <E> void printArrayData()
	{
		
	}
}

public class Prog4 {

	public static void main(String[] args)
	{
	   List<Integer> obj1=new ArrayList<>();
	   obj1.add(1);
	   obj1.add(22);
	   obj1.add(21);
	   obj1.add(8);
	   
	   Data3 D=new Data3();
	   D.printListData(obj1);
	   D.printArrayData();
	   
	   List<String> obj2=new ArrayList<>();
	   obj2.add("hello");
	   obj2.add("Batch");
	   obj2.add("B37");
	   obj2.add("Program");
	   D.printListData(obj2);
	   
	   List<Double> obj3=new ArrayList<>();
	   obj3.add(2.5);
	   obj3.add(3.5);
	   obj3.add(4.5);
	   obj3.add(5.5);
	   D.printListData(obj3);
	   
	   List<Character> obj4=new ArrayList<>();
	   obj4.add('a');
	   obj4.add('b');
	   obj4.add('c');
	   obj4.add('d');
	   D.printListData(obj4);
	   
	   List<Float> obj5=new ArrayList<>();
	   obj5.add(1.8f);
	   obj5.add(2.8f);
	   obj5.add(3.8f);
	   obj5.add(4.8f);
	   D.printListData(obj5);

	}

}
