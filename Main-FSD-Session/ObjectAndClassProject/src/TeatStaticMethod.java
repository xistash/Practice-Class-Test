class Student7{
	int rollno;
	String name;
	static String Institute = "IITR";
	
	static void change() {
		Institute = "IITB";
	}
	Student7(int r,String n){
		rollno = r;
		name = n;
	}
	void display() {System.out.println(rollno+" "+name+" "+Institute);}
}
public class TeatStaticMethod {
	public static void main(String[]args) {
		Student7.change();
		
		Student7 s1 = new Student7(101,"Akshay");
		Student7 s2 = new Student7(102,"Mahi");
		Student7 s3 = new Student7(103,"Gautam");
		
		s1.display();
		s2.display();
		s3.display();
	}
}
