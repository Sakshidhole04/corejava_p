//class and object

package java1;

public class Mainclass1 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="Sakshi";
		s1.age=22;
		
		Student s2=new Student();
		s2.name="Sahil";
		s2.age=24;
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
	}

}
class Student{
	String name;
	int age;
}