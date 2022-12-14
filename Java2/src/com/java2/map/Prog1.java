//hashmap
//duplicate key are not allowed but values can be duplicated
package com.java2.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prog1 {

	public static void main(String[] args) 
	{
		//HashMap m=new HashMap();
		HashMap<Integer,String> m = new HashMap<>();
		
		//put method --add key value pair
		m.put(101, "john");
		m.put(102, "david");
		m.put(103, "scott");
		m.put(104, "mary");
		m.put(103, "x");  //key duplicate
		m.put(106, "scott");  //value duplicate
		m.put(105, "jack");
		
		
		System.out.println(m);
		
		//get method
		m.get(105);  //if we want to retrive value using key
		System.out.println(m.get(105));
		
		//remove method
		m.remove(106);//remove pair from hashmap
		System.out.println(m);
		
		//contains key method 
		m.containsKey(102);//key is present or not
		System.out.println(m.containsKey(102));//true
		System.out.println(m.containsKey(106));//false
		
		//contains value method
		m.containsValue("mary");//value is present in hashmap or not
		System.out.println(m.containsValue("mary"));//true
		System.out.println(m.containsValue("m"));//false
		
		//empty method
		m.isEmpty();//hashmap is empty or not
		System.out.println(m.isEmpty());//false
		
		//keyset method
		m.keySet();//return all the keys as a set 
		System.out.println(m.keySet());
		
		//we can get all the keys individually
		//for(Object i:m.keySet())
		for(int i:m.keySet())
		{
			System.out.println(i);
		}
		
		//values set
		m.values();//return all the values collection
		System.out.println(m.values());
		
		//we can get all the values individually
		//for(Object j:m.values())
		for(String j:m.values())
		{
			System.out.println(j);
		}
		
		//entryset method
		m.entrySet();//return all entry as set object
		System.out.println(m.entrySet());
		
		//want key and values side by side
		for(int a:m.keySet())
		{
			System.out.println(a+"     "+m.get(a));
		}
		
		//*****Generic*****
		//get a specific entry
		//entry interface method
		//Elements can traverse in any order
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"      "+entry.getValue());
		}
		
		//*****non Generic*****
		//iterator method
		//get all the entry using iterator method
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry =  (Entry) itr.next();
			System.out.println(entry.getKey()+"      "+entry.getValue());
		}

	}

}
