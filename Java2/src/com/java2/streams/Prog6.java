package com.java2.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog6 {

	public static void main(String[] args)
	{
		List <String> l=Arrays.asList("Sakshi","sonalika","joffery","sansa");
		
		//before java8/without using streams
		for(String s:l)
		{
			System.out.println(s.length());
			 
		}
		
		//stream --map
	   /* l.stream().map(n->n.length()).collect(Collectors.toList());
	    System.out.println();*/
		
		//l.stream().map(n->n.length()).forEach(v->System.out.println(v));
		l.stream().map(n->n.length()).forEach(System.out::println);

	}

}
