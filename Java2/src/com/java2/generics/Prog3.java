//method in generic
package com.java2.generics;

class Data_generics<K,V>
{
	private K key;
	private V value;
	public Data_generics(K key, V value) 
	{
		super();
		this.key = key;
		this.value =value;
	}
	public K getKey() 
	{
		return key;
	}
	public V getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return "Data_generics [key=" + key + ", v=" + value + "]";
	}
//method in generic***********	
	public <E,N> void display(E element,N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
}

public class Prog3 {

	public static void main(String[] args)
	{
		Data_generics<Integer,String> obj_generic=new Data_generics<Integer,String>(25,"Sakshi");
		System.out.println("key: "+obj_generic.getKey()+" "+"value: "+obj_generic.getValue());
        
		obj_generic.display("Sakshi", 26);
	}

}
