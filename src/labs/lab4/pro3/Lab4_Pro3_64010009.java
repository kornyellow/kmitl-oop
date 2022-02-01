package labs.lab4.pro3;

import classes.List;
import classes.Palindrome;
import classes.SelectionSort;
import classes.StopWatch;

public class Lab4_Pro3_64010009 {

	public static void main(String[] args) {

		final int MAX_SORT_ELEMENTS = 1000;
		final int MAX_PALINDROME_PRIME_ELEMENTS = 1000;

		float[] numbers_list = List.createRandomListOfNumbers(MAX_SORT_ELEMENTS);

		StopWatch stopwatch = new StopWatch();
		System.out.println("Sorting stopwatch starts...");

		SelectionSort.sort(numbers_list);
		List.displayList(numbers_list);

		stopwatch.stop();
		System.out.println("Sorting stopwatch stopped.");

		System.out.printf("The sort time is %.2f milliseconds.\n", stopwatch.getElapsedTime() / 1000000.f);
		System.out.println("------------------------------------------------------------");

		stopwatch.start();
		System.out.println("The palindrome prime stopwatch starts...");

		Palindrome.createPalindromePrime(MAX_PALINDROME_PRIME_ELEMENTS);

		stopwatch.stop();
		System.out.println("The palindrome prime stopwatch stopped.");

		System.out.printf("The palindrome prime time is %.2f milliseconds.\n", stopwatch.getElapsedTime() / 1000000.f);
	}
}
