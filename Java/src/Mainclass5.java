//this keyword
public class Mainclass5 {

public static void main(String[] args) {
		
		Person1 s1=new Person1();
		s1.name="Sakshi";
		s1.age=22;
		
		Person1 s2=new Person1(24,"Sahil");
		//s2.name="Sahil";
		//s2.age=24;
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		
		s1.walk();
		s2.walk(20);
		s1.eat();
		System.out.println(Person1.count);
	}

}
  class Person1{
	String name;
	int age;
	static int count;
	
	 public Person1() {
	    System.out.println("constructor");
	    count++;
	 }
	 
	 public Person1(int age, String name) {
		 this();  //use for calling same class of different constructor //calling the frst constructor
		 this.age=age;//use for calling parameters of same class
		 this.name= name;
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