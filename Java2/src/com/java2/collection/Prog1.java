//Queue interface
//FIFO

package com.java2.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prog1 {

	public static void main(String[] args) 
	{
	Queue<Integer> obj=new PriorityQueue<>();	
	//add method
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(40);
	obj.add(50);
	
	System.out.println(obj);
	
	//remove method
	obj.remove();
	System.out.println(obj);
	
	//poll method
	obj.poll();
	//obj.poll();
	System.out.println(obj);
	
	//element method
	//obj.element();
	System.out.println(obj.element());

	//peek method
	//obj.peek();
	System.out.println(obj.peek());
	
	//offer()method
	obj.offer(20);
	obj.offer(10);
	System.out.println(obj);
	

	}

}
