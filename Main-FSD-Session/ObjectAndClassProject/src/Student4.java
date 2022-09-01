//initialization through reference

class Studentv2{
	int id;
	String name;
}
public class Student4 {
	public static void main(String[]args) {
		
		Studentv2 s1 = new Studentv2();
		s1.id = 12345;
		s1.name = "Akshay";
		
		System.out.println(s1.id+" "+s1.name); //printing
	}

}
