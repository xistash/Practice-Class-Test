package com.greatlearning.corejava;

public class ConstructorDemo {
	public ConstructorDemo () {
		System.out.println("I'm default Constructor");
	}
	public ConstructorDemo(int a, float f, String s,char c) {
		System.out.println("I am parameterized constructor and i take various inputs");
		System.out.println("the square of an integer no is "+a*a);
		System.out.println("the square of float is "+f*f);
		System.out.println("the string entered is "+s);
		System.out.println("the entered character is "+c);
	}
	public void observations() {
		System.out.println("inside Observations method");
	}
	
	public static void main(String[]args) {
		System.out.println("inside Observations method 1");
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(5,0.5f,"hello EveryOne",'a');
		
		System.out.println("from object Creationmethod 2");
		ConstructorDemo obj2,obj3;
		obj2 = new ConstructorDemo();
		obj3 = new ConstructorDemo(15,2.98f,"hii energy",'C');
		
		
		obj.observations();
	}

		
		
	

}