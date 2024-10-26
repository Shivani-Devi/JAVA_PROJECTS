package PROJECTS;
import java.util.Scanner;

public class Proj2_1_AverageOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is the program for obtaining the average of three numbers");
		System.out.println("Enter Num1: ");
		double num1=sc.nextDouble();
		
		System.out.println("Enter Num2: ");
		double num2=sc.nextDouble();
		
		System.out.println("Enter Num3: ");
		double num3=sc.nextDouble();
		
		double average = (num1 + num2 + num3) / 3;
		System.out.println("Average of the numbers "+ "is "+ average );
	}

}
