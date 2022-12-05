//inheritance
package encapsulation;

class Superclass
{
	void display()
	{
		System.out.println("I am from superclass");
	}
}
class Subclass extends Superclass
{
	void run()
	{
		System.out.println("I am from subclass");
	}
}
class Subclass2 extends Subclass
{
	void test()
	{
		System.out.println("I am from subclass2");
	}
}
public class Inheritance extends Subclass2
{	
	public static void main(String[] args) {
		
		Subclass2 s1= new Subclass2();
		s1.display();
        s1.run();
        s1.test();
	}

}
