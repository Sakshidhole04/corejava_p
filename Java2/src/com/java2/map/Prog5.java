//sorted map
package com.java2.map;

import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Prog5 {

	public static void main(String[] args)
	{
		SortedMap<Integer,String> l=new TreeMap<>();
		l.put(10,"Amar");
		l.put(11,"dipak");
		l.put(12,"shivani");
		l.put(13,"naina");
    
		System.out.println(l);
		
		// first key---first value
		System.out.println(l.firstKey());
		
		//last key----last value
		System.out.println(l.lastKey());
		
		//heap map------less than
		System.out.println(l.headMap(12));
		
		//tailmap------greater or equal
		System.out.println(l.tailMap(12));
		
		//submap-------in between
		System.out.println(l.subMap(10, 13));
		
		//comparator----null
		System.out.println(l.comparator());

	}

}
