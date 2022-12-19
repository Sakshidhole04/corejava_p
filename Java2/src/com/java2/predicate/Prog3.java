//join two predicate---->.and, or, negate(methods)
//joining of predicates
//p1 --->checks number is even
//p2 --->checks greater than 50

package com.java2.predicate;

import java.util.function.Predicate;

public class Prog3 {

	public static void main(String[] args) 
	{
		int a[]= {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75};
		
		Predicate<Integer> pr=i->(i%2==0);
		Predicate<Integer> pr1=i->(i>50);
		
		//and--->we can join the predicate using and or negate methods
		System.out.println("folloeig are numbers EVEN and Greater than 50...");
		
		/*for(int n:a)
		{
			//if(pr.test(n) && pr1.test(n))
			//if(pr.and(pr1).test(n))
			//if(pr.or(pr1).test(n))
			if(pr.negate().test(n))
			{
				System.out.println(n);
			}
		}*/
		
		//or
		/*for(int n:a)
		{
			//if(pr.test(n) || pr1.test(n))
			if(pr.or(pr1).test(n))
			{
				System.out.println(n);
			}
		}*/
		
		//negate
		for(int n:a)
		{
			//if(pr.negate().test(n))
			if(pr1.negate().test(n))
			{
				System.out.println(n);
			}
		}
		

	}

}
