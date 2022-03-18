package classes;

public class SavingsAccount extends Account {

	public SavingsAccount() {

		super();
	}

	public SavingsAccount(int id, double balance) {

		super(id, balance);
	}

	public void withdraw(double amount) {

		this.setBalance(this.getBalance() - amount);
		if (this.getBalance() < 0) {
			System.out.println("ERROR: Savings account cannot be overdrawn");
			this.setBalance(0);
		}
	}
}
