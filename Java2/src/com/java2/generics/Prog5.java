//boundry
//method boundry
package com.java2.generics;

class Data_generic1<K extends String,V extends String>
{
	private K key;
	private V value;
	public Data_generic1(K key, V value) 
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
//method in generic boundry***********	
	public <E extends String,N extends Integer> void display(E element,N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
	public <E extends Integer,N extends Integer> void display(E element,N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
	public <E extends Character,N extends Integer> void display(E element,N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
	public <E extends Float,N extends Integer> void display(E element,N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
}

public class Prog5 {

	public static void main(String[] args)
	{
		Data_generic1<String,String> obj_generic=new Data_generic1<String,String>("sak","Sakshi");
		System.out.println("key: "+obj_generic.getKey()+" "+"value: "+obj_generic.getValue());
    
//through generic		
		obj_generic.display("Sakshi", 26);
		obj_generic.display(25, 26);
		obj_generic.display('a', 26);
		obj_generic.display(2.5f, 26);
	}

}