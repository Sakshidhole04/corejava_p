//predicate---predefined functional interface
//predicate--> one parameter return boolean arguement
//use only if you have conditional check in your program...

package com.java2.predicate;

import java.util.function.Predicate;

public class Prog1 {

	public static void main(String[] args)
	{
		//Ex1
		Predicate<Integer> p=(i)->(i>10);
		//p is ref variable 
		//i is an arguement
		System.out.println(p.test(20));//true
		System.out.println(p.test(5));//false
		
		//Ex2--->check the length of given string is greater than 4 or not
		
		Predicate<String> p1=s->(s.length()>4);
		System.out.println(p1.test("welcome"));//true
		System.out.println(p1.test("wel"));//false
		
		//Ex3--->Print array element whose size is greater than 4 from array
		
		String names[]= {"john","mary","smith","scott","david"};
		
		//enhance loop
		for(String name:names)
		{
			if(p1.test(name))
			{
				System.out.println(name);
			}
			
			/*if(name.length()>4)//10 con
			{
				System.out.println(name);
			}*/
			
		}
		


	}

}
