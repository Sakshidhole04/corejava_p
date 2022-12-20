package com.java2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog5 {

	public static void main(String[] args)
	{
		List <String> l=Arrays.asList("Sakshi","sonalika","joffery","sansa");
		
		List<String> l1=new ArrayList<String>();
		
		//before java8 /without using streams
		/*for(String n:l)
		{
         l1.add(n.toUpperCase());	
		}
		System.out.println(l1);*/
		
		//stream --map
		
		//l1=l.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		//System.out.println(l1);
		//l.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		l.stream().map(n->n.toUpperCase()).forEach(System.out::println);
	
	
	}

}
