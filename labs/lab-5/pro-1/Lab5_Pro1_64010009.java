public class Lab5_Pro1_64010009 {

	public static void main(String[] args) {

		Account.setAnnualInterestRate(0.045);

		Account account = new Account(1122, 20000);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Monthly: " + account.getMonthlyInterest());
		System.out.println("Created on: " + account.getDateCreated().toString());
	}
}
