package com.java2.consumers;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Employee
{
	String ename;
	int salary;
	String gender;
	
	Employee(String ename ,int salary, String gender)
	{
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}
}
public class Prog2 {

	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("john",50000,"male"));
		al.add(new Employee("jerry",40000,"female"));
		al.add(new Employee("jack",30000,"male"));
		al.add(new Employee("jill",20000,"female"));
		
		//Function
		Function<Employee,Integer> f=emp->(emp.salary*10)/100;//task1---->calculate the bonus
		
		//Predicate
		Predicate<Integer> p=b->b>=5000;//task2--->check bonus value is greater than 5000 or not
		
		//Consumer      //task3---->return data
		Consumer <Employee> c=emp->{
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
			                      };
		//enhance for loop
		
		for(Employee e:al)
		{
			int bonus=f.apply(e); //calculate bonus Invoked Function
			
			if(p.test(bonus))    //Invoked Predicate
			{
				c.accept(e);     //Invoked Consumer
				System.out.println(bonus);
			}
		}
			                      
			                      

	}

}
