//method with arguement and return some value
//if we have more than one statement then we will put curly braces
package com.java2.lambda;

interface Toyota
{
	public String bookcab(String source,String destination);
}
//class Benz implements Toyota
//{
//	public String bookcab(String source,String destination)//return type string 
//	{
//		System.out.println("Cab book from "+source+" to "+destination);
//		return("Price 8000 Rs");
//	}	
//}

public class Prog4 {

	public static void main(String[] args) 
	{
//		Toyota t=new Benz();
		
		Toyota t=(source,destination)->{
		System.out.println("Cab book from "+source+" to "+destination);
		return("Price 8000 Rs");
		};//end with semicolon //type of variable not required
		
		System.out.println(t.bookcab("Hydrabad", "Chennai"));

	}

}
