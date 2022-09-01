
public class ExampleMaxNumber {
	static int count = 10;
	//static int i = 5;
	public static void main(String[]args) {
		while(count -->0)
		{CheckStatic();}
	}
	public static void CheckStatic() {
		int i = 5;
		i++;
		System.out.println(" "+i);
		System.out.println(" "+count);
	}

}
