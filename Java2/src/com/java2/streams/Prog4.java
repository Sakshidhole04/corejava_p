package com.java2.streams;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class Prog4 {

	public static void main(String[] args)
	{
		List<Product> pl=new ArrayList<Product>();
		
		pl.add(new Product(1,"hp laptop",25000));
		pl.add(new Product(2,"lenova laptop",23000));
		pl.add(new Product(3,"apple laptop",95000));
		pl.add(new Product(4,"dell laptop",28000));
		
		pl.stream()
		.filter(p->p.price>25000)   //filtering
		.forEach(pr->System.out.println(pr.price));  //iterating

	}

}
