//Creating two objects
class Studentv3{
	
	int id;
	String name;
}
public class Student5 {
	public static void main(String[]args) {
		
		//creating objects
		
		Studentv3 s1 = new Studentv3();
		Studentv3 s2 = new Studentv3();
		
		//initializing objects
		
		s1.id = 12345;
		s1.name = "Akshay";
		s2.id = 54321;
		s2.name = "pepe";
		
		//printing data
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}

}
