import java.util.Scanner;

public class Pro3_64010009 {

	static int number = -1;
	static int digit_sum = 0;

	public static void main(String[] args) {

		Pro3_64010009.getUserInput();
		Pro3_64010009.findDigitSum();

		System.out.println("The sum of the digits is " + digit_sum);
	}

	static void getUserInput() {

		Scanner scanner = new Scanner(System.in);

		while(number > 1000 || number < 0) {

			System.out.print("Enter a number between 0 and 1000: ");
			number = scanner.nextInt();
		}

		scanner.close();
	}

	static void findDigitSum() {

		while(number != 0) {

			int digit_extract = number % 10;
			digit_sum += digit_extract;

			number /= 10;
		}
	}
}