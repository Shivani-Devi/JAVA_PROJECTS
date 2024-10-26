package PROJECTS;
import java.util.Scanner;

public class Proj_4_1_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] values = new int[5];
		for(int i=0; i<values.length; i++) {
			System.out.print("Enter value at index "+(i+1)+":\t");
			values[i]=sc.nextInt();
		}//end for loop
		
		for(int num: values) {
			num*=2;
			System.out.println("New values are "+num+"\t");
		}
//		for(int i=0; i<values.length; i++) {
//			values[i]*=2;
//			System.out.println("New values are "+values[i]+"\t");
//		}
		
	}//end main
}
