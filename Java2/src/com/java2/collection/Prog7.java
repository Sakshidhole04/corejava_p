//compare to method
//Integer--- (1stvalue == 2ndvalue--0), (1stvalue > 2ndvalue--1), 
//(1stvalue < 2ndvalue--(-1))
//String----- (1stvalue == 2ndvalue--0), (1stvalue > 2ndvalue--how far it will)

package com.java2.collection;

public class Prog7 {

	public static void main(String[] args) 
	{
		String x="a";
		String y="d";

		System.out.println(x.compareTo(y));
		
		Integer u=2;
		Integer v=1;
		
		System.out.println(u.compareTo(v));
	}

}
