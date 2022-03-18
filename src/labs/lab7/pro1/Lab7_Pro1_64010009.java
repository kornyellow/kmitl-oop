package labs.lab7.pro1;

import classes.Account;
import classes.CheckingAccount;
import classes.SavingsAccount;

public class Lab7_Pro1_64010009 {

	public static void main(String[] args) {

		Account account = new Account(0, 5000);
		System.out.println("Normal Account");
		System.out.printf("Balance is %.2f\n", account.getBalance());
		System.out.println("Withdraw: 10000.00");
		account.withdraw(10000);
		System.out.printf("Balance is %.2f\n", account.getBalance());
		System.out.println(account);
		System.out.print("\n");

		CheckingAccount checking_account = new CheckingAccount(1, 5000, 5000);
		System.out.println("Checking Account");
		System.out.printf("Balance is %.2f\n", checking_account.getBalance());
		System.out.println("Withdraw: 10000.00");
		checking_account.withdraw(10000);
		System.out.printf("Balance is %.2f\n", checking_account.getBalance());
		System.out.println(checking_account);
		System.out.print("\n");

		SavingsAccount savings_account = new SavingsAccount(2, 5000);
		System.out.println("Checking Account");
		System.out.printf("Balance is %.2f\n", savings_account.getBalance());
		System.out.println("Withdraw: 5000.00");
		savings_account.withdraw(5000);
		System.out.printf("Balance is %.2f\n", savings_account.getBalance());
		System.out.println(savings_account);
	}
}
