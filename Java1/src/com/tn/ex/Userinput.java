package com.tn.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Userinput {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.println("Enter a number");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());//gives string "45"=45 string to int 
        System.out.println(n);
	}

	
}
