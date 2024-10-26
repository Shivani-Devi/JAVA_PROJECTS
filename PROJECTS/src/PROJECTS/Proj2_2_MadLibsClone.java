package PROJECTS;
import java.util.Scanner;

public class Proj2_2_MadLibsClone {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first adjective: ");
	String adjective1=sc.nextLine();
	
	System.out.println("Enter girl`s name: ");
	String girlsName=sc.nextLine();
	
	System.out.println("Enter occupation: ");
	String occupation=sc.nextLine();
	
	System.out.println("Enter the name of a place: ");
	String place = sc.nextLine();
	
	System.out.println("Enter the name of clothes: ");
	String clothing = sc.nextLine();
	
	System.out.println("Enter a hobby: ");
	String hobby=sc.nextLine();
	
	System.out.println("Enter the occupation2: ");
	String occupation2=sc.nextLine();
	
	System.out.println("Enter the boy name: ");
	String boyName=sc.nextLine();
	
	System.out.println("Enter the name of the king:");
	String king=sc.nextLine();
	
	System.out.println();
	System.out.println("There once was a "+ adjective1 + " girl named "+ girlsName + 
			" who was a "+ occupation + " in the kingdom of "+ place +
			".\nShe loved to wear "+ clothing + " and to "+ hobby + 
			". She wanted to marry the "+ occupation2+ " named "+
			boyName+ "\nbut her father, King "+ king+ " forbid her from seeing him.");
	}

}
