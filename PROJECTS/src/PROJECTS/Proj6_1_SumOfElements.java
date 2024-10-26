package PROJECTS;
import java.util.ArrayList;

public class Proj6_1_SumOfElements {
 public static void main(String[] args) {
	 
	 ArrayList<Integer> numbers = new ArrayList<>();
	 numbers.add(45);
	 numbers.add(59);
	 numbers.add(2);
	 System.out.println("ArrayList contains:\t"+numbers);
	 sumElements(numbers);
 }
 
 public static void sumElements(ArrayList<Integer> numbers) {
	 int sum=0;
//	 for(int i=0; i<numbers.size(); i++){ 
//	     sum+=numbers.get(i);
//	 }
	 for(int num : numbers) {
		 sum+=num;
	 }
	 System.out.println("Sum is:\t"+sum);
 }
}
