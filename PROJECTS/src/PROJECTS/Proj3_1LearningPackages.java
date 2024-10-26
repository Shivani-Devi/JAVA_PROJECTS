package PROJECTS;

import java.util.Scanner;

public class Proj3_1LearningPackages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Learning Course");
	
		System.out.println("Which package would you like to choose?");
		System.out.println("1. Learning package 1: $10/per month icludes 2 courses per month and $6 for additional course");
		System.out.println("2. Learning package 2: $12/per month icludes 4 courses per month and $4 for additional course");
		System.out.println("2. Learning package 3: $15/per month icludes 6 courses per month and $3 for additional course");

	   int packageNumber, howManyCourses, baseCost, costPerCourse, numIncluded, totalCost;
	   
	   System.out.println("Which package you want to choose? \t");
	   packageNumber = sc.nextInt();
	   
	   System.out.println("How mnay courses you want to enroll in? ");
	   howManyCourses = sc.nextInt();
	   
	   if(packageNumber == 1) {
		   baseCost=10;
		   costPerCourse=6;
		   numIncluded=2;
	   }
	   
	   else if(packageNumber == 2) {
		   baseCost=12;
		   costPerCourse=4;
		   numIncluded=4;
	   }
	   
	   else {
		   baseCost=15;
		   costPerCourse=3;
		   numIncluded=6;
	   }

	   if(howManyCourses > numIncluded) {
		   totalCost= baseCost+(howManyCourses - numIncluded)*costPerCourse;
	   }
	   else {
		   totalCost =baseCost;
	   }
	   System.out.println("Total cost for the cousrse selected is : \t$"+totalCost);
}		
}
