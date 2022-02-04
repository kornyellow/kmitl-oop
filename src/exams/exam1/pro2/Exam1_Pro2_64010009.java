package exams.exam1.pro2;

import java.util.Scanner;

public class Exam1_Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] random_alphabets = getRandomAlphabets(5);
		char[] random_numbers = getRandomNumbers(5);

		System.out.print("Random characters are: ");
		printAlternatingChars(random_alphabets, random_numbers);

		int selection;

		while (true) {

			System.out.print("Select group of characters [1] characters or [2] numerics: ");
			selection = scanner.nextInt();

			if (selection >= 1 && selection <= 2) break;
			System.out.println("ERROR: invalid choice, try again!");
		}
		scanner.close();

		if (selection == 1) {

			System.out.print("Characters not in the list are: ");
			printExcludeAlphabets(random_alphabets);

		} else {

			System.out.print("Numerics not in the list are: ");
			printExcludeNumbers(random_numbers);
		}

		System.out.println("End of program.");
	}

	public static char[] getRandomNumbers(int amount) {

		char[] random_chars = new char[amount];

		for (int i = 0; i < amount; i++)
			random_chars[i] = (char) ((Math.random() * 10) + '0');

		return random_chars;
	}

	public static char[] getRandomAlphabets(int amount) {

		char[] random_chars = new char[amount];

		for (int i = 0; i < amount; i++)
			random_chars[i] = (char) ((Math.random() * 10) + 'a');

		return random_chars;
	}

	public static void printAlternatingChars(char[] arr_1, char[] arr_2) {

		int order = 0;
		for (int i = 0; i < arr_1.length + arr_1.length; i++) {

			if (i % 2 == 0) System.out.print(arr_1[order] + " ");
			else {
				System.out.print(arr_2[order] + " ");
				order++;
			}
		}
		System.out.print("\n");
	}

	public static void printExcludeAlphabets(char[] exclude_alphabets) {

		char[] include_alphabets = new char[10];
		for (int i = 0; i < 10; i++) include_alphabets[i] = (char) ('a' + i);

		for (char include_alphabet : include_alphabets) {

			boolean is_exclude = true;
			for (char exclude_alphabet : exclude_alphabets) {
				if (include_alphabet == exclude_alphabet) {
					is_exclude = false;
					break;
				}
			}
			if (is_exclude) System.out.print(include_alphabet + " ");
		}

		System.out.print("\n");
	}

	public static void printExcludeNumbers(char[] exclude_numbers) {

		char[] include_numbers = new char[10];
		for (int i = 0; i < 10; i++) include_numbers[i] = (char) ('0' + i);

		for (char include_number : include_numbers) {

			boolean is_exclude = true;
			for (char exclude_number : exclude_numbers) {
				if (include_number == exclude_number) {
					is_exclude = false;
					break;
				}
			}
			if (is_exclude) System.out.print(include_number + " ");
		}

		System.out.print("\n");
	}
}
