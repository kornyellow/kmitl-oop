package classes;

import java.util.Date;

public class Transaction {

	public Transaction(char type, double amount, double balance, String detail) {

		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.detail = detail;

		this.date = new Date();
	}

	private final Date date;
	private final char type;
	private final double amount;
	private final double balance;
	private final String detail;

	public Date getDate() {

		return this.date;
	}

	public char getType() {

		return this.type;
	}

	public double getAmount() {

		return this.amount;
	}

	public double getBalance() {

		return this.balance;
	}

	public String getDetail() {

		return this.detail;
	}
}
