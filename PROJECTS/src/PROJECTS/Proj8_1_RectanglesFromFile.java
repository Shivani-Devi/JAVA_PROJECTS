package PROJECTS;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Proj8_1_RectanglesFromFile {
	public static void main(String[] args) {
		ArrayList<Rectangle> rectangleList= new ArrayList<>();
		fillArrayList(rectangleList);
		printRectangle(rectangleList);
	}
	
	public static void fillArrayList(ArrayList<Rectangle> rectangleList) {
		Scanner file1;
		Rectangle temp;
		double length;
		double breadth;
		try {
			file1 = new Scanner(new File("src/PROJECTS/rectangles_data.txt"));
			while(file1.hasNext()) {
				length=file1.nextDouble();
				breadth=file1.nextDouble();
			    temp = new Rectangle(length, breadth);
			    rectangleList.add(temp);
			}
			file1.close();
		}//end try
		catch(FileNotFoundException ex) {
			System.out.println("Can`t find the file\n"+ex.getMessage());
		}
		
	}
	
	public static void printRectangle(ArrayList<Rectangle> rectangleList) {
		for(Rectangle r : rectangleList) {
			System.out.println("Length: "+r.getLength());
			System.out.println("Breadth: "+r.getBreadth());
			System.out.println("Perimeter: "+r.perimeter());
			System.out.println("Area: "+r.area());
			System.out.println();
		}
	}

}
