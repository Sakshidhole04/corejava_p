//buffereReader
package com.tn.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Input2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the loc and pin ");
		BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));

		int x=Integer.parseInt(bf.readLine());
		System.out.println("entered pin "+x);
		
		//String str=bf.readLine();
		//System.out.println("entered string is "+str );

	}

}
