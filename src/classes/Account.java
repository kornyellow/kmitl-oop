package classes;

import java.util.Date;

public class Account {

	public Account() {

		this(0, 0);
	}

	public Account(int id, double balance) {

		this.id = id;
		this.balance = balance;

		this.date_created = new Date();
	}

	public void withdraw(double amount) {

		this.balance -= amount;
	}

	public void deposit(double amount) {

		this.balance += amount;
	}

	public double getMonthlyInterest() {

		return this.getMonthlyInterestRate() * this.balance;
	}

	public double getMonthlyInterestRate() {

		return this.annual_interest_rate / 12;
	}

	private int id;
	private double balance;

	private final Date date_created;

	public int getID() {

		return this.id;
	}

	public void setID(int id) {

		this.id = id;
	}

	public double getBalance() {

		return this.balance;
	}

	public void setBalance(double balance) {

		this.balance = balance;
	}


	public Date getDateCreated() {

		return this.date_created;
	}

	private double annual_interest_rate;

	public double getAnnualInterestRate() {

		return this.annual_interest_rate;
	}

	public void setAnnualInterestRate(double annual_interest_rate) {

		this.annual_interest_rate = annual_interest_rate;
	}
}
