public class Palindrome {

	public static void createPalindromePrime(int max_prints) {

		System.out.println("Creating " + max_prints + " palindrome prime elements...");

		int n = 0;
		int number = 2;
		while (n < max_prints) {

			if (isPalindrome(number) && isPrime(number)) {

				System.out.print(number + " ");

				n++;
				if (n % 10 == 0) System.out.print("\n");
			}

			number++;
		}

		System.out.println("Palindrome prime created.");
	}

	private static boolean isPrime(int number) {

		if (number == 2) return true;
		if (number % 2 == 0) return false;

		for (int n = 2; n <= Math.sqrt(number); n++) {

			if (number % n == 0) return false;
		}

		return true;
	}

	private static boolean isPalindrome(int number) {

		char[] number_chars = ("" + number).toCharArray();

		int length = number_chars.length;
		for (int i = 0; i < length / 2; i++) {

			if (number_chars[i] != number_chars[length - i - 1]) return false;
		}
		return true;
	}
}
