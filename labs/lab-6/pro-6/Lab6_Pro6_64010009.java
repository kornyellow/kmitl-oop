import java.util.Scanner;

public class Lab6_Pro6_64010009 {

	static Scanner scanner = new Scanner(System.in);

	static final int CHECK_BALANCE = 1;
	static final int WITHDRAW = 2;
	static final int DEPOSIT = 3;
	static final int EXIT = 4;

	static Account[] accounts = new Account[10];
	static int selected_id = -1;
	static int selected_menu = -1;

	public static void main(String[] args) {

		final double DEFAULT_BALANCE = 100;

		for (int id = 0; id < accounts.length; id++)
			accounts[id] = new Account(id, DEFAULT_BALANCE);

		while (true) {

			promptID();
			if (selected_id == -1) break;

			while (true) {

				promptMenu();
				if (selected_menu == CHECK_BALANCE) checkBalance();
				else if (selected_menu == WITHDRAW) withdraw();
				else if (selected_menu == DEPOSIT) deposit();
				else if (selected_menu == EXIT) {

					System.out.println("End of program.\n");
					break;
				}
				System.out.print("\n");
			}
		}
		scanner.close();
	}

	private static void checkBalance() {

		System.out.printf("The balance is %.2f\n", accounts[selected_id].getBalance());
	}

	private static void withdraw() {

		double amount;

		while (true) {

			System.out.print("Enter an amount to withdraw: ");
			amount = scanner.nextDouble();

			if (amount > 0) break;
			System.out.println("ERROR: invalid amount, try again!");
		}
		accounts[selected_id].withdraw(amount);
	}

	private static void deposit() {

		double amount;

		while (true) {

			System.out.print("Enter an amount to deposit: ");
			amount = scanner.nextDouble();

			if (amount > 0) break;
			System.out.println("ERROR: invalid amount, try again!");
		}
		accounts[selected_id].deposit(amount);
	}

	private static void promptMenu() {

		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");

		while (true) {

			System.out.print("Enter a choice: ");
			selected_menu = scanner.nextInt();

			if (selected_menu >= 1 && selected_menu <= 4) break;
			System.out.println("ERROR: invalid input, try again!");
		}
	}

	private static void promptID() {

		while (true) {

			System.out.print("Enter an id: ");
			selected_id = scanner.nextInt();

			if (selected_id >= -1 && selected_id <= 9) break;
			System.out.println("ERROR: incorrect id, try again!");
		}
		System.out.print("\n");
	}
}
