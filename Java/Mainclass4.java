//constructor
//static keyword
package java1;

public class Mainclass4 {

public static void main(String[] args) {
		
		Person s1=new Person();
		s1.name="Sakshi";
		s1.age=22;
		
		Person s2=new Person();
		s2.name="Sahil";
		s2.age=24;
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		
		s1.walk();
		s2.walk(20);
		s1.eat();
		System.out.println(Person.count);
	}

}
  class Person{
	String name;
	int age;
	static int count;
	
	 public Person() {
	    System.out.println("constructor");
	    count++;
	 }
	 
	void walk() {
		System.out.println(name+" "+"is walking");
	}
	
	void walk(int steps) {
		System.out.println(name+" "+"walked "+steps+" steps");
	}
	
	void eat() {
		System.out.println(name+" "+"is eating");
	}

}