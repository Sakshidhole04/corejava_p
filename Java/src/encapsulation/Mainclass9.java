//interface
package encapsulation;

public class Mainclass9 implements Car1,Person {

	public static void main(String[] args) {
		

	}

	@Override
	public void start() {
		System.out.println("my car is starting");
		
	}

	@Override
	public void walk() {
		
	}

}

interface Car1{
	
	void start();

}
interface Person{
	
	void walk();
}