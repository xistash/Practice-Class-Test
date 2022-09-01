package com.greatlearning.corejava;

public class StaticFinalDemo{ //creating variable non-static and static
	int var1 = 10;
	static int var2 = 10;
	
	//creating method1
	public void method1() {
		var1++;
		System.out.println(var1);
	}
	//creating method2
	public void method2() {
		var2++;
		System.out.println(var2);
	}
	
	//main method
	public static void main(String[]args) {
		//creating objects
		
		StaticFinalDemo obj = new StaticFinalDemo();
		StaticFinalDemo obj2 = new StaticFinalDemo();
		StaticFinalDemo obj3 = new StaticFinalDemo();
		
		//printing non-static variable using method1
		
		System.out.println("Using Non-Static Keyword");
		obj.method1();
		obj2.method1();
		obj3.method1();
		
		//printing static variable using method2
		
		System.out.println("Using Static Keyword");
		obj.method2();
		obj2.method2();
		obj3.method2();
		
		// End
	}

}
