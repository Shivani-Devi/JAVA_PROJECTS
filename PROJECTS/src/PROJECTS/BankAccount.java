package PROJECTS;

public class BankAccount {
	// Important for adding owner and for depositing and withdrawing options
	private String owner;
	private int balance;
	
	public BankAccount(String owner) {
		this(owner,0);
	}

	public BankAccount(String owner, int balance) {
		this.owner=owner;
		this.balance=balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void deposit(int amount) {
		if(amount>0) {
		balance+=amount;
		System.out.println("Balance: "+balance);
		}
		else {
			System.out.println("The amount to deposit must be greatet than 0.");
		}
	}
	
	public void withdraw(int amount) {
		if(balance>=amount && amount>0) {
			balance= balance-amount;
			System.out.println("After withdrawl the amount remains to "+balance);
		}
		else {
			System.out.println("Your withdrawal amount is exceeding than what you have."
					+ "\nIt`s $"+balance);
		}
	}
	
	public int getBalance() {
		return balance;
	}
	

}
