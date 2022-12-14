//Linkedhash map
package com.java2.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prog4 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> l=new LinkedHashMap<>();
		l.put(10,"Amar");
		l.put(11,"dipak");
		l.put(12,"shivani");
		l.put(13,"naina");
		
		System.out.println(l);
		
		TreeMap<Integer,String> l1=new TreeMap<>();
		l1.put(10,"Amar");
		l1.put(11,"dipak");
		l1.put(12,"shivani");
		l1.put(13,"naina");
		
		System.out.println(l1);
		

	}

}
