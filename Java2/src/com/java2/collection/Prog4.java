//ArrayList
//arraylist is a case sensitive
package com.java2.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Prog4 {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<>();
		obj.add("Brazil");
		obj.add("Belgium");
		obj.add("Urope");
		obj.add("France");
		obj.add("Dubai");
		
		System.out.println(obj);
		
		//remove method
		obj.remove("Belgium");
		System.out.println(obj);
		
		//set method-----modify
		obj.set(3, "chennai");
		System.out.println(obj);
		
		//index off method
		obj.indexOf("chennai");
		System.out.println(obj.indexOf("chennai"));
		System.out.println(obj.indexOf("India"));
		
		//get element
		obj.get(0);
		System.out.println(obj.get(0));
		
		//add ele in between
		obj.add(1,"Italy");
		System.out.println(obj);
		
		//size 
		obj.size();
		System.out.println(obj.size());
		
		//loop
		for(int i=0; i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
        System.out.println(obj);
        
        //sorting
        Collections.sort(obj);
        System.out.println(obj);
	}

}
