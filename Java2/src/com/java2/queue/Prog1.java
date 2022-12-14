//deque
//ArrayDeque
package com.java2.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prog1 {

	public static void main(String[] args) 
	{
		 Deque <String> d=new ArrayDeque<>();
		 d.add("A");
		 d.add("B");
		 d.add("C");
		 d.add("D");
		 d.offer("e");
		 d.offerFirst("a");
		 d.offerLast("Z");
		 
		 System.out.println(d);

		 //peek and element method-----return head element
		 d.peek();
		 d.element();
		 System.out.println(d.peek());
		 
		 //poll and remove method -----return head and then remove it
		 d.poll();
		 d.remove();
		 System.out.println(d.remove());
		 
	}

}
