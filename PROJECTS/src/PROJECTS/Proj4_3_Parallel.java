package PROJECTS;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		
		String name;
		int age;
		for(int i=0; i<5; i++) {
		System.out.print("Please enter name: \t");
		name=sc.nextLine();
		
		System.out.print("Please enter age: \t");
		age=sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		names.add(name);
		ages.add(age);
		}//end for loop
	
		for(int i=0; i<ages.size(); i++) {
			System.out.println(names.get(i)+" is "+ages.get(i));
		}
	}

}
