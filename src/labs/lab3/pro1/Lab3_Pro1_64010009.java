package labs.lab3.pro1;

public class Lab3_Pro1_64010009 {

	public static void main(String[] args) {

		final int MAX_PRINT = 100;

		int n = 0;
		int number = 2;
		while (n < MAX_PRINT) {

			if (isPrime(number) && isPalindrome(number)) {

				System.out.print(number + " ");

				n++;
				if (n % 10 == 0) System.out.print("\n");
			}

			number++;
		}
	}

	public static boolean isPrime(int number) {

		if (number == 2) return true;

		for (int n = 2; n <= Math.sqrt(number); n++) {

			if (number % n == 0) return false;
		}

		return true;
	}

	public static boolean isPalindrome(int number) {

		String number_str = String.valueOf(number);
		StringBuilder number_str_reversed = new StringBuilder(number_str);
		number_str_reversed.reverse();

		return number_str.equals(number_str_reversed.toString());
	}
}