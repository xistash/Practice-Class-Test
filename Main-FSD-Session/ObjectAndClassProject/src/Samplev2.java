class A{
private int data = 1999;
public void msg() {
	System.out.println(data);
	System.out.println("hello java");
 }
}
public class Samplev2 {
	public static void main(String[]args) {
		A obj = new A();
		//System.out.println(obj.data);
		obj.msg();
	}

}
