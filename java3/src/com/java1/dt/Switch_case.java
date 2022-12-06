package com.java1.dt;

public class Switch_case {

	public static void main(String[] args) 
	{
		char ch='b';
		switch(ch)
		{
		case  'a':
		case  'A':
			System.out.println("The val of ch is a");
			break;
		case  'b':
		case  'B':
			System.out.println("The val of ch is b");
			break;
		case  'c':
		case  'C':
			System.out.println("The val of ch is c");
			break;	
		default:
			System.out.println("The val of ch is other than a,b,c");
		}
        String name="author";
		switch(name)
		{
		case "author":
			System.out.println("Sakshi");
			break;
		case "Team":
			System.out.println("full stack java");
			break;
		case "editor":
			System.out.println("payal");
			break;	
		default:
			System.out.println("invalid entry");
		}
	}

}
