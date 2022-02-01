package labs.lab1.pro3;

import java.util.Scanner;

public class Lab1_Pro3_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int input_number = scanner.nextInt();
		scanner.close();

		if (input_number > 0 && input_number < 1000) {

			int digit_1, digit_2, digit_3, digit_sum;

			digit_1 = input_number % 10;
			input_number /= 10;

			digit_2 = input_number % 10;
			input_number /= 10;

			digit_3 = input_number % 10;

			digit_sum = digit_1 + digit_2 + digit_3;

			System.out.println("The sum of the digits is " + digit_sum);

		} else System.out.println("ERROR: input out of range");
	}
}
