package PROJECTS;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj5_1_NamePermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    ArrayList<String> firstNames = new ArrayList<>();
	    ArrayList<String> lastNames = new ArrayList<>();
	    
	    String fullName;
	    String firstName;
	    String lastName;
	    int indexOfSpace;
	    
	    final int NUM_VALUES = 5;
	    for(int i=0; i<NUM_VALUES; i++) {
	    	System.out.print("Enter your name "+i+" :\t");
	    	fullName = sc.nextLine();
	    	indexOfSpace = fullName.indexOf(" ");
	    	firstName = fullName.substring(0, indexOfSpace);
	    	lastName = fullName.substring(indexOfSpace);
	    	
	    	firstNames.add(firstName);
	    	lastNames.add(lastName);
	    	
	    }//end for
	    System.out.println(firstNames);
	    System.out.println(lastNames);
	    for(int i=0; i<firstNames.size(); i++) {
	    	for(int j=0; j<lastNames.size(); j++) {
	    		System.out.print(firstNames.get(i));
	    		System.out.println(lastNames.get(j));
	    	}//end j
	    }//end i
	}
}
