package com.greatlearning.corejava;

public class ThreeDimensionShape {
	 double width,height,depth;
	
	 ThreeDimensionShape(double w, double h, double d){
		 width = w;
		 height = h;
		 depth = d;	 
	 }
	 ThreeDimensionShape(){
		 width=height=depth=0;
	 }
	 ThreeDimensionShape(double I){
		 width=height=depth=I;
	 }
	 double volume() {
		 return width * height * depth;
	 }
}


	