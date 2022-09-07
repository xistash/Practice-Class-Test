package com.greatlearning.oops;

class InheritanceA{
	final float pi = 22 / 7;
	public float radius, result;
	
	public void circleArea(float rad) {
		radius = rad;
		result = pi*radius*radius;
		System.out.println("the area of thevircle is "+radius+"cm");
		
	}
}

class InheritanceB extends InheritanceA{
	public float length, breadth, result;
	
	public void rectangleArea(int i,int b) {
		length = i;
		breadth = b;
		result = length*breadth;
		
		System.out.println("the area of the rectangle is "+result+"cm square");
	}
}

class InheritanceC extends InheritanceB{
	public float base, height, result;
	
	public void triangleArea(int b, int h ) {
		base = b;
		height = h;
		result = 0.5f*base*height;
		
		System.out.println("the area of the triangle is "+result+"cm square");
	}
}

public class Challenge10Solution {
	
	public static void main(String[]args) {
		
		InheritanceC  inheritancec = new InheritanceC();
		inheritancec.circleArea(22.5f);
		inheritancec.rectangleArea(5, 6);
		inheritancec.triangleArea(3, 4);
	}

}
