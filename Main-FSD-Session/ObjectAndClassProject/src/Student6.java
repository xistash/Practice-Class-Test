//initialization through method
class Studentv4{
	int rollno;
	String name;
	
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {System.out.println(rollno+" "+name);}
	
	}

public class Student6 {
	public static void main(String[]args) {
		
		Studentv4 s1 = new Studentv4();
		Studentv4 s2 = new Studentv4();
		s1.insertRecord(2004,"akshay");
		s2.insertRecord(2005,"Rahul");
		s1.displayInformation();
		s2.displayInformation();
	}

}
