package com.tn.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Userinput {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("Enter ");
		
	String s=br.readLine();
        int n =Integer.parseInt(br.readLine());//gives string "45"=45 string to int 
        double avg =Double.parseDouble(br.readLine());
        char ch=(char)br.read();
        
        System.out.println(s+" "+n+" "+avg+" "+ch);
	}

	
}
