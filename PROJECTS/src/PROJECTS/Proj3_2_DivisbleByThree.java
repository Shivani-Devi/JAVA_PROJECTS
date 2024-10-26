package PROJECTS;
import java.util.Scanner;

public class Proj3_2_DivisbleByThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: \t");
		int number = sc.nextInt();
		
		if(number%3 == 0) {
			System.out.println("The number is divisible by 3");
		}
		else {
			System.out.println("The number is NOT divisible by 3");
		}
	}

}
