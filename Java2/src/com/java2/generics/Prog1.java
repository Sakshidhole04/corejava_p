//generics--makes the colllection homogenous
//no need to perform upcasting while add the object to collection
//removing element downcasting
package com.java2.generics;

class Data
{
	private String str;

	public Data(String str) 
	{
		super();
		this.str = str;
	}

	public String getStr() 
	{
		return str;
	}


	public String toString() 
	{
		return "Data [str=" + str + "]";
	}
}
//*********generate generics class******//
class Data_generic<T>
{
	private T obj;

	public Data_generic(T obj) 
	{
		super();
		this.obj = obj;
	}

	public T getObj()
	{
		return obj;
	}

	public String toString() 
	{
		return "Data_generic [obj=" + obj + "]";
	}
}
public class Prog1 {

	public static void main(String[] args) 
	{
//		Data obj=new Data("hello batch b37");
//		String out=obj.getStr();
//		System.out.println(out);
		
		//*********generics******//
		//Data_generic<String> obj_generic=new Data_generic<String>("hello batch b37");
		//String out=obj_generic.getObj();
		//System.out.println(out);
		
		//Data_generic<Integer> obj_generic=new Data_generic<Integer>(37);
		//Integer out=obj_generic.getObj();
		//System.out.println(out);
		
//		Data_generic<Float> obj_generic=new Data_generic<Float>(37.2f);
//		Float out=obj_generic.getObj();
//		System.out.println(out);
		
//		Data_generic<Double> obj_generic=new Data_generic<Double>(37.5);
//		Double out=obj_generic.getObj();
//		System.out.println(out);

	}

}
