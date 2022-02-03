package classes;

import java.util.ArrayList;

public class NewAccount extends Account {

	public NewAccount(String name, int id, double balance) {

		super(id, balance);
		this.name = name;
		this.transactions = new ArrayList<>();
	}

	public void withdraw(double amount, String detail) {

		double balance_after_transaction = this.getBalance() - amount;
		this.setBalance(balance_after_transaction);

		this.transactions.add(new Transaction(
			'W',
			amount,
			balance_after_transaction,
			detail
		));
	}

	public void deposit(double amount, String detail) {

		double balance_after_transaction = this.getBalance() + amount;
		this.setBalance(balance_after_transaction);

		this.transactions.add(new Transaction(
			'D',
			amount,
			balance_after_transaction,
			detail
		));
	}

	private final String name;
	private final ArrayList<Transaction> transactions;

	public String getName() {

		return this.name;
	}

	public ArrayList<Transaction> getTransactions() {

		return this.transactions;
	}
}
