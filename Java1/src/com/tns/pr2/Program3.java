package com.tns.pr2;

import com.tns.pr1.Program1;
import com.tns.pr1.Program4;

public class Program3 extends Program1 
{

	public static void main(String[] args) {
		Program3 p3 =new Program3();
		p3.test();
		System.out.println(p3.x);
		
        p3.run();
        System.out.println(p3.b);
        Program4 s=new Program4();
	}

}
