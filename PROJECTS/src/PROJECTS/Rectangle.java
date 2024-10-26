package PROJECTS;

public class Rectangle {

	private double length;
	private double breadth;
	private static int numRectangles;
	
	   public Rectangle() {
		   this(1.0,1.0);
	   }
	   
	   public Rectangle(double length, double breadth) {
		   this.length=length;
		   this.breadth=breadth;
		   numRectangles++;
	   }
	   
	   public double getLength() {
		   return length;
	   }
	   
	   public void setLength(double length) {
		   this.length=length;
	   }
	   
	   public double getBreadth() {
		   return breadth;
	   }
	   
	   public void setBreadth(double braedth) {
		   this.breadth=breadth;
	   }
	   
	   public double perimeter() {
		   return 2*(length+breadth);
	   }
	   
	   public double area() {
		   return length*breadth;  
	   }
	   
	   public static int numRectangles() {
		   return numRectangles;
	   }
}
