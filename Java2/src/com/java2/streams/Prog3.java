package com.java2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog3 {

	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("cup",null,"forest","book",null,"rabbit");
		
		List<String> w=words.stream().filter(n->n!=null).collect(Collectors.toList());
		System.out.println(w);
		
		
		
		
		

	}

}
