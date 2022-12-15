//Wildcard
//? is known as wildcard
//combination of generic and collection
package com.java2.wildcard;

import java.util.ArrayList;
import java.util.List;

class KIA
{
	private int vehicle;

	public KIA(int vehicle) 
	{
		super();
		this.vehicle = vehicle;
	}

	public int getVehicle()
	{
		return vehicle;
	}

	public String toString() 
	{
		return "KIA [vehicle=" + vehicle + "]";
	}
}
class Seltos extends KIA
{
	private String CarMode;

	public Seltos(int vehicle, String carMode)
	{
		super(vehicle);
		CarMode = carMode;
	}

	public String getCarMode() 
	{
		return CarMode;
	}

	
	public String toString()
	{
		return "Seltos [CarMode=" + CarMode + "]";
	}
}


public class Prog1 
{
	//public static void disp(List<KIA>list)
	//public static void disp(List<Object>list)
//	wildcard ?
	public static void disp(List<?>list)
	
	{
		//for(KIA i:list)
		for(Object i:list)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
	//List <KIA> list=new ArrayList<>();
	List <Object> list=new ArrayList<>();
	
	list.add(new KIA(1));
	list.add(new KIA(4));
	list.add(new KIA(2));
	list.add(new KIA(3));
	list.add(new Seltos(8,"Sakshi"));
	list.add(new Seltos(9,"Sushi"));
	
	
	
	disp(list);

	}

}
