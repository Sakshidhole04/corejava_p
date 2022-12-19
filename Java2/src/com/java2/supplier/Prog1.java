//supplier---> doesnit take input but supply/return us the value
package com.java2.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Prog1 {

	public static void main(String[] args)
	{
		Supplier<Date> s=()->new Date();
		System.out.println(s.get()) ;
	

	}

}
