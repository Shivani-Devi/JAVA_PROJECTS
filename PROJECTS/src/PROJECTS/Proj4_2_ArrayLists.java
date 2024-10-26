package PROJECTS;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_2_ArrayLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> myArray = new ArrayList<>();
		
//		while(true) {
//			System.out.print("Please enter the number: \t");
//			input=sc.nextDouble();
//			if(input<0) {
//				System.out.println("Thank You for playing");
//				break;
//			}
//			myArray.add(input);
//		}
//		System.out.println(myArray);
		
		System.out.print("Please enter the number: \t");
		double input=sc.nextDouble();
		while(input>0) {
			myArray.add(input);
			System.out.print("Please enter the number: \t");
			input=sc.nextDouble();
		}
		for(int i=0; i<myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
	}
}
