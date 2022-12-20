//multiple conditions under filter method

package com.java2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog2 {

	public static void main(String[] args) 
	{
		List <String> l=Arrays.asList("Sakshi","sonalika","joffery","sansa");
		List<String> l1=new ArrayList<String>();
		
		/*l1=l.stream().filter(n->n.length()>6 && n.length()<8).collect(Collectors.toList());
		System.out.println(l1);*/
		
		//l.stream().filter(n->n.length()>6 && n.length()<8).forEach(n->System.out.println(n));
		
		l.stream().filter(n->n.length()>6 && n.length()<8).forEach( System.out::println);
		

	}

}
