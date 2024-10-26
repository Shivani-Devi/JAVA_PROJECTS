package PROJECTS;
import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
	
	public static void main(String[] args) {
       Random random = new Random();
       Scanner sc = new Scanner(System.in);
   
       int randomNumber = random.nextInt(100)+1;
       System.out.println("The random number Chosen by the computer is:\t"+randomNumber);
      
       int userNumber;
       int count=0;
       
       while(true) {
    	   System.out.println("Please guess the number:\t");
    	   userNumber=sc.nextInt();
    	   count++;
           if(userNumber >=1 && userNumber <=100) {
              if(userNumber == randomNumber) {
    	         System.out.println("Congratulations! You guessed the number in the number guesses.");
    	         System.out.println("You took "+count+" counts to answer the guess number.\nThank You!!!!");
    	         break;
               }
              else if(userNumber > randomNumber) {
    	         System.out.println("Your guess was too high.");
              }
              else {
    	         System.out.println("Your guess was too low");
              }
           }
           else {
    	     System.out.println("That`s the wasted guess. Choose the numbear between 1-100");
    	   
           }
          
       } //end while  
      
  }
}
