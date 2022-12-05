package com.tn.ex;

import java.util.Scanner;

public class Input {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//String input
		System.out.println("Enter the name ");
		String name=sc.nextLine();
		
		//Character input
		System.out.println("Enter the gender ");
		char gender =sc.next().charAt(0);
		
		//Integer input
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		
		//Long input
		System.out.println("Enter the mobile_no ");
		long mb_no=sc.nextLong();
		
		//double input
		System.out.println("Enter the percentage ");
		double percent=sc.nextDouble();
		
		//float input
		float rf=sc.nextFloat();
		
		//Short input
		Short s=sc.nextShort();
		
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("mb_no: "+mb_no);
		System.out.println("percent: "+percent+"%");
		
	}

}
