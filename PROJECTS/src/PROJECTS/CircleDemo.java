package PROJECTS;

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle();
		printData(c2);
		printData(c1);
	}

	public static void printData(Circle circle) {
		System.out.println("RADIUS: "+circle.getRadius()
		+"\nCIRCUMFERENCE: "+String.format("%.2f",circle.circumference())
		+"\nAREA: "+String.format("%.2f",circle.area())+"\n");
	}
}
