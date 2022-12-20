package com.java2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog7 {

	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(2,3,4,5,6);
		List<Integer> l1=new ArrayList<Integer>();
		
		//befor 8 without stream
		/*for(int i:l)
		{
			//System.out.println(i*3);
			l1.add(i*3);
		}
        System.out.println(l1);*/
		
		
		//streams --map
		/*l1=l.stream().map(i->i*3).collect(Collectors.toList());
		System.out.println(l1);*/
		
		//l.stream().map(n->n*3).forEach(n->System.out.println(n));
		
		l.stream().map(n->n*3).forEach(System.out::println);
		
	}

}
