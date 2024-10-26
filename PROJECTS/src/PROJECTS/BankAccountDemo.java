package PROJECTS;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount("SHIVANI",500);
		BankAccount ac2 = new BankAccount("MADHU THAKUR",5000);
		
		returnOwner(ac1);
		ac1.deposit(1000);
		ac1.getBalance();
		ac1.withdraw(200);
		ac1.getBalance();
		
		System.out.println();
		
		returnOwner(ac2);
		ac2.deposit(1000);
		ac2.getBalance();
		ac2.deposit(0);
		ac2.getBalance();
		ac2.withdraw(-1);
		ac2.getBalance();
	}
	public static void returnOwner(BankAccount acc) {
		System.out.println("Owner: "+acc.getOwner());
	}
}
