//abstraction
package encapsulation;
abstract class Mumbai_rules
{
	abstract void speedLimit();
	abstract void rashDriving();
	abstract void rule3();
	void slower_moving()
	{
		System.out.println("no fine for slower");
	}
	void electric()
	{
		System.out.println("no helmet");
	}
}

class seltos extends Mumbai_rules
{
	void speedLimit()
	{
		System.out.println("speed limit is 80");
	}
	void rashDriving()
	{
		System.out.println("alert voice");
	}
	void rule3()
	{
		System.out.println("");
	}
	void speed()
	{
		System.out.println("speed is 160");
	}
}
class sonet
{
	void speed()
	{
		System.out.println("speed is 180");
	}
}
class carnival
{
	void speed()
	{
		System.out.println("speed is 160");
	}
}

public class Tata_motors {

	public static void main(String[] args) 
	{
		seltos s1=new seltos();
		s1.speedLimit();
		s1.slower_moving();
		s1.rashDriving();
		s1.electric();

	}

}