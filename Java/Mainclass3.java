//polymorphism

package java1;

public class Mainclass3 {

public static void main(String[] args) {
		
		Student2 s1=new Student2();
		s1.name="Sakshi";
		s1.age=22;
		
		Student2 s2=new Student2();
		s2.name="Sahil";
		s2.age=24;
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		
		s1.walk();
		s2.walk(20);
		s1.eat();
	}

}
  class Student2{
	String name;
	int age;
	
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
