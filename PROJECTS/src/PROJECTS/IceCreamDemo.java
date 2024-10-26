package PROJECTS;

public class IceCreamDemo {
	public static void main(String[] args) {
		
		IceCream ic1 = new IceCream("Vanilla",4,2);
		ic1.addTopping("Sprinkles");
		printData(ic1);
		ic1.printToppings();
		
	}
	
	public static void printData(IceCream cream) {
		System.out.println("ICE CREAM: "+cream.getName()
		+"\nCost: "+cream.getCost()+"\nNumber of Scoops: "+cream.getNumScoops());
	}

}
