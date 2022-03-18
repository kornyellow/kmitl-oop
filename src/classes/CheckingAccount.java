package classes;

public class CheckingAccount extends Account {

	public CheckingAccount(int id, double balance, double overdraft_limit) {

		super(id, balance);
		this.overdraft_limit = overdraft_limit;
	}

	public void withdraw(double amount) {

		this.setBalance(this.getBalance() - amount);
		if (this.getBalance() < -this.overdraft_limit) {

			System.out.println("ERROR: cannot withdrawn over the limit (" + this.overdraft_limit + ")");
			this.setBalance(-this.overdraft_limit);
		}
	}

	private final double overdraft_limit;

	public double getOverdraftLimit() {
		return overdraft_limit;
	}
}
