package PROJECTS;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Proj8_2_CirclesFromFile {
	public static void main(String [] args) {
		ArrayList<Circle> circlesAL = new ArrayList<>();
		printCircles(circlesAL);
		printArrayList(circlesAL);
	}
	
	public static void printCircles(ArrayList<Circle> circlesAL) {
		Scanner file1;
		Circle c1;
		try {
			file1 = new Scanner(new File("src/PROJECTS/circles_data.txt"));
			double radius;
			while(file1.hasNext()) {
				radius = file1.nextDouble();
				c1 = new Circle(radius);
				circlesAL.add(c1); //adding the data to array list
			}
			file1.close();
		}//end try
		
		catch(FileNotFoundException ex) {
			System.out.println("The file can`t be fetched"+ex.getMessage());
		}
	}

	public static void printArrayList(ArrayList<Circle> circlesAL) {
		try {
		PrintWriter pw = new PrintWriter("circles_area.txt");
		for(Circle c : circlesAL) {
			System.out.println("RADIUS: "+c.getRadius());
			System.out.println("CIRCUMFERENCE: "+c.circumference());
			System.out.println("AREA: "+c.area());
			System.out.println();
			pw.println("RADIUS: "+c.getRadius());
			pw.println("CIRCUMFERENCE: "+c.circumference());
			pw.println("AREA: "+c.area());
			pw.println();
		}
		pw.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Can`t write in the file "+ex.getMessage());
		}
	}
}
