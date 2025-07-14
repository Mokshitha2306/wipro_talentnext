package oops_questions;
import java.util.*;
 class box {
	 double width;
	 double height;
	 double depth;
	 public box (double width,double height,double depth) {
		 this.width=width;
		 this.height=height;
		 this.depth=depth;
	 }
	 public double CalculateVolume() {
		 return (width*height*depth);
	 }
	
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter width of box");
		 double width=sc.nextDouble();
		 System.out.println("Enter height of box");
		 double height=sc.nextDouble();
		 System.out.println("Enter depth of box");
		 double depth=sc.nextDouble();
		 box myBox=new box(width,height,depth);
		 double volume=myBox.CalculateVolume();
		 System.out.println("volume of a box:" + volume);
		 
	 }
 }
	 
