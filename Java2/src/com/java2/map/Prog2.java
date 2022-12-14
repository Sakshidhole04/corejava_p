//HashTable
package com.java2.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prog2 {

	public static void main(String[] args) 
	{
		//Hashtable t=new Hashtable();//capacity is 11,load factor 0.75
		
		Hashtable<Integer,String> t=new Hashtable<>();
		t.put(101, "Seema");
		t.put(102, "Purvi");
		t.put(103, "Kalki");
		t.put(104, "divya");
		//t.put(null, "Seema");//NullPointerException
		//t.put(101, "null");//NullPointerException
		
		System.out.println(t);
		
		//get method
		t.get(103);
		System.out.println(t.get(103));
		
		//remove method
		t.remove(103);
		System.out.println(t);
		
		//contain method
		System.out.println(t.containsKey(104));//true
		System.out.println(t.containsKey(103));//false
		
		System.out.println(t.containsValue("divya"));//true
		System.out.println(t.containsValue("kalki"));//false
		
		//empty method
		System.out.println(t.isEmpty());
		
		//keyset values method
		System.out.println(t.keySet());
		System.out.println(t.values());
		
		//loop for individual set
		for(int k:t.keySet())
		{
			System.out.println(k+"   "+t.get(k));
		}
		
		//entry specific method
	     for(Map.Entry entry:t.entrySet())
	     {
	    	 System.out.println(entry.getKey()+"   "+entry.getValue());
	     }
		
		//iterator method
	    Set s=t.entrySet();
	    
	    Iterator itr=s.iterator();
	    
	    while(itr.hasNext())
	    {
	    	Map.Entry entry=(Entry) itr.next();
	    	System.out.println(entry.getKey()+"   "+entry.getValue());
	    }
	    
	    

	}

}
