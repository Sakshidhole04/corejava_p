//filter method
package com.java2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog1 {

	public static void main(String[] args)
	{
		//ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(10);
//		al.add(15);
//		al.add(16);
//		al.add(19);
//		al.add(50);
		
		//Arrays class aslist method
		List<Integer> al=Arrays.asList(10,15,18,20,25,45);
		List <Integer> l=new ArrayList<Integer>();
		
		//without using streams
		/*for(int n:al)
		{
			if(n%2==0)
				l.add(n);//add method
		}
		System.out.println(l);*/
		
		//using streams
		
		/*l=al.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(l);*/
		
		//al.stream().filter(n->n%2==0).forEach(n->System.out.println(n));//foreach --consumer
		
		al.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//al.stream-->al.stream(adding collection to stream)is use store all data to l
		//filter(n->n%2==0)--->use to filter data under certain condition using predicate
		//collect(Collectors.toList()--->then collect the data into some other collection
		
		 
		

	}

}
