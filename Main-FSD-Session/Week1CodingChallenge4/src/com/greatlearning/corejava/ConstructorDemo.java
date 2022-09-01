package com.greatlearning.corejava;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("Hello everyone! , this is akshay here "+"hope you are doing well");
	}
	public ConstructorDemo(String name,int age , String location) {
		System.out.println("Hello everyone!, this is "+name+" and my age is "+age+" and i'm from "+location+" hope you are doing well");
	}
	public static void main(String[]args) {
		ConstructorDemo constructorDemo;
		constructorDemo = new ConstructorDemo();
		constructorDemo = new ConstructorDemo("Akshay",23,"Gujarat");
		
		
	}

}
