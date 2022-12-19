//predicate n function together

package com.java2.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	
	Employee(String ename,int salary)
	{
		this.ename=ename;
		this.salary=salary;
	}
}
public class Prog2 {

	public static void main(String[] args)
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee("john",50000));
		al.add(new Employee("mary",40000));
		al.add(new Employee("jerry",30000));
		al.add(new Employee("scott",20000));
		
		Function<Employee,Integer> fn=s->{
			int sal=s.salary;
			
			if(sal>=10000 && sal<=20000)
				return(sal*10/100);
			else if(sal>20000 && sal<=30000)
				return(sal*20/100);
			else if(sal>30000 && sal<=40000)
				return(sal*30/100);
			else
				return(sal*40/100);
		};
		
		Predicate<Integer> p=b->b>5000;
		
		for(Employee e:al)
		{
			int bonus = fn.apply(e);//function
			if(p.test(bonus))//predicate
			{
			System.out.println(e.ename+" "+e.salary);
			System.out.println("Bonus is "+bonus);
			}
		}

	}

}
