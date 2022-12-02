//method

package java1;

public class MainClass2 {

public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.name="Sakshi";
		s1.age=22;
		
		Student1 s2=new Student1();
		s2.name="Sahil";
		s2.age=24;
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		
		s1.walk();
		s1.eat();
	}

}
  class Student1{
	String name;
	int age;
	
	void walk() {
		System.out.println(name+" "+"is walking");
	}
	
	void eat() {
		System.out.println(name+" "+" is eating");
	}
}