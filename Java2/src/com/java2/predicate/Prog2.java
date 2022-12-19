package com.java2.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	int salary;
	int experience;
	String ename;

//constructor
	Employee(int sal,int exp,String name)
	{
		ename=name;
		experience=exp;
		salary=sal;
	}
}
public class Prog2 {

	public static void main(String[] args) 
	{
	//EX1:-
	Employee emp=new Employee(50000,6,"john");
	
	//emp obj-->return name if salary>50k exp>3
	Predicate<Employee> pr=e->(e.salary>30000 && e.experience>3);
	//System.out.println(pr.test(emp));
	
	//EX2:-
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee(50000,6,"john"));
	al.add(new Employee(40000,5,"scott"));
	al.add(new Employee(30000,4,"mary"));
	al.add(new Employee(20000,3,"jery"));
	
	for(Employee e:al)
	{
		//if(e.salary>30000 && e.experience>3)
		if(pr.test(e))
		{
			System.out.println(e.ename+" "+e.salary);
		}
	}
	

	}

}
