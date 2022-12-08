package com.java3.interfacee;

interface AmazonCompany
{
	abstract void menu();
	abstract void order_online();	
	abstract void delivery();
}
class Raymond implements AmazonCompany
{
	public void menu()
	{
		System.out.println("Chinos and Trouser");
		System.out.println("Blazer");
		System.out.println("T-shirts and Polo");
	}
	public void order_online()
	{
		System.out.println("Receive by Amazon");
		System.out.println("issue the order by Amazon ");
		System.out.println("Amazon people will ready order");
	}
	public void delivery()
	{
		System.out.println("handover the order to delivery person");
	}
	
}
class Nike implements AmazonCompany
{
	public void menu()
	{
		System.out.println("Running Shirts and tops");
		System.out.println("Jorden shoes");
		System.out.println("Running Trousers and T-shirts");
	}
	public void order_online()
	{
		System.out.println("Receive by Nike");
		System.out.println("issue the order by Nike ");
		System.out.println("Nike team people will ready order");
	}
	public void delivery()
	{
		System.out.println("handover the order to delivery person");
	}
	
}
class Amazonapp
{
	AmazonCompany selectbrand(char ch)
	{
		if(ch=='A')
		{
			return new Raymond();
		}
		else 
		{
			return new Nike();  
		}
	}
}
public class Prog1 {

	public static void main(String[] args)
	{
		Amazonapp ref=new Amazonapp();
	    AmazonCompany ac=ref.selectbrand('N');//A 
	    ac.menu();
	    ac.order_online();
	    ac.delivery();
	}

}
