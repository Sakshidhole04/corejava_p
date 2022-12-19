// 
package com.java2.functions;

import java.util.function.Function;

public class Prog1 {

	public static void main(String[] args)
	{
		Function<Integer,Integer> f=n->n*n;//parameter type and return type
		
		System.out.println(f.apply(5));//25
		System.out.println(f.apply(10));//100
		System.out.println(f.apply(2));//4
		
		//String length
		//string--->length--->int
		
		Function<String,Integer> f1=s->s.length();
		
		System.out.println(f1.apply("welcome"));//7
		System.out.println(f1.apply("java Programming"));//16


	}

}
