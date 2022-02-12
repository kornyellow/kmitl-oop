package labs.lab7.pro2;

import classes.NewAccount;
import classes.Transaction;

public class Lab7_Pro2_64010009 {

	public static void main(String[] args) {

		NewAccount account_george = new NewAccount("George", 1122, 1000);
		account_george.setAnnualInterestRate(0.015);
		account_george.deposit(30);
		account_george.deposit(40);
		account_george.deposit(50);
		account_george.withdraw(5);
		account_george.withdraw(4);
		account_george.withdraw(2);

		System.out.println("Name: " + account_george.getName());
		System.out.println("Account ID: " + account_george.getID());
		System.out.println("Annual interest rate: " + account_george.getAnnualInterestRate() * 100);
		System.out.println("Balance: " + account_george.getBalance());

		System.out.println("Date\t\t\t\t\t\t\t\tType\t\t\tAmount\t\t\tBalance");

		for (Transaction transaction : account_george.getTransactions()) {

			System.out.printf("%s\t\t", transaction.getDate());
			System.out.printf("%s\t\t\t\t", transaction.getType());
			System.out.printf("%.2f\t\t\t", transaction.getAmount());
			System.out.println(transaction.getBalance());
		}
	}
}
