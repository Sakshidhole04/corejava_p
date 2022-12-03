//encapsulation
package encapsulation;

public class Mainclass7 {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		//l1.price=21;
		l1.setPrice(31);
        System.out.println(l1.getPrice());
	}
}
class Laptop{ 
	int ram;
	public int getRam() {
		return ram;
	}
 
	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	private int price;
	
	public void setPrice(int price) {
		
		//is the user an Admin
		boolean isAdmin=true;
		if(!isAdmin) {
			System.out.println("you cannot set the price");
		}
		else {
			this.price=price;
		}
	}
}