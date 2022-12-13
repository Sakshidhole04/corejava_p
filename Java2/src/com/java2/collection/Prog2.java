//stack
//LIFO

package com.java2.collection;

import java.util.Stack;

public class Prog2 {

	public static void main(String[] args)
	{
       Stack<Integer> obj=new Stack<>();
       obj.push(10);
       obj.push(20);
       obj.push(30);
       obj.push(40);
       obj.push(50);

       System.out.println(obj);
       
       //pop method 
       obj.pop();
       obj.pop();
       System.out.println(obj);
       
       //peek method 
       obj.peek();
       System.out.println(obj.peek());
       
       //search method
       obj.search(30);
       System.out.println(obj.search(30));
       System.out.println(obj.search(40));
       
       //empty method
       obj.empty();
       System.out.println(obj);
       
       
       
	}

}
