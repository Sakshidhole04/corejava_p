//map
//case sensitive
package com.java2.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prog3 {

	public static void main(String[] args)
	{
		Map<Integer,String> m=new HashMap<>();
		m.put(101, "India");
		m.put(102, "Austria");
		m.put(103, "russia");
		m.put(104, "japan");
		m.put(105, "China");
	
		System.out.println(m);
		
		System.out.println(m.get(102));
		
		System.out.println(m.containsValue("China"));
		
		System.out.println(m.containsKey(101));
		
		System.out.println(m.keySet());
		
		System.out.println(m.values());
		
		for(int i:m.keySet())
		{
			System.out.println(i+"  "+m.get(i));
		}
		
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
				
	}

}
