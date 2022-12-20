package com.java2.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Prog8 {

	public static void main(String[] args)
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,6,8);
		
		values.forEach(i->doubleit(i));
		
		
		
		//values.forEach(i->System.out.println(i));
		
		/*Consumer<Integer> c=i->System.out.println(i);
		values.forEach(c);*/
		
		//values.forEach(i->System.out.println(i));
		
		//values.forEach(System.out::println);//call by value call by reference call bymethod

	}

	public static void doubleit(int i)
	{
		
		System.out.println(i*2);
	}

}
