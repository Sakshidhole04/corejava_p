//fuction chaining---> andThen() and compose() (methods)

package com.java2.functions;

import java.util.function.Function;

public class Prog3 {

	public static void main(String[] args)
	{
		Function<Integer,Integer> f1=s->s*2;
		Function<Integer,Integer> f2=s->s*s*s;
		
		System.out.println(f1.andThen(f2).apply(2));//4  64//f1tof2
		System.out.println(f1.compose(f2).apply(2));//8  16//f2tof1

	}

}
