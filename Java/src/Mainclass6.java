//inheritance
//static keyword
public class Mainclass6 {

public static void main(String[] args) {
		
		Person2 s1=new Person2();
		s1.name="Sakshi";
		s1.age=22;
		
		Person2 s2=new Person2(24,"Sahil");
		//s2.name="Sahil";
		//s2.age=24;
		
		Developer d1=new Developer(26,"Anuja");
		d1.walk();
		d1.todowork();
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		
		s1.walk();
		s2.walk(20);
		s1.eat();
		System.out.println(Person2.count);
	}

}

  class Developer extends Person2{
	  public Developer(int age,String name) {
	  super(age,name);//super is use to call custrutor of parent
	  }
	  void todowork() {
		  
			System.out.println(name +" "+" is doing work");
		}
  }
 
  
  class Person2{
	String name;
	int age;
	static int count;
	
	 public Person2() {
	    System.out.println("constructor");
	    count++;
	 }
	 
	 public Person2(int age, String name) {
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