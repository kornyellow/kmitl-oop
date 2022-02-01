package labs.lab2.pro3;

import java.util.Scanner;

public class Lab2_Pro3_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String city_first, city_second, city_third;

		while (true) {

			System.out.print("Enter the first city: ");
			city_first = scanner.nextLine();

			if (!city_first.isBlank() && city_first.charAt(0) >= 'A' && city_first.charAt(0) <= 'Z')
				break;

			System.out.println("ERROR: invalid city name");
		}
		while (true) {

			System.out.print("Enter the second city: ");
			city_second = scanner.nextLine();

			if (!city_second.isBlank() && city_second.charAt(0) >= 'A' && city_second.charAt(0) <= 'Z')
				break;

			System.out.println("ERROR: invalid city name");
		}
		while (true) {

			System.out.print("Enter the third city: ");
			city_third = scanner.nextLine();

			if (!city_third.isBlank() && city_third.charAt(0) >= 'A' && city_third.charAt(0) <= 'Z')
				break;

			System.out.println("ERROR: invalid city name");
		}
		scanner.close();

		String result;

		if (city_first.compareTo(city_second) < 0 && city_first.compareTo(city_third) < 0) {

			if (city_second.compareTo(city_third) < 0) {
				result = city_first + " " + city_second + " " + city_third;
			} else {
				result = city_first + " " + city_third + " " + city_second;
			}
		} else if (city_second.compareTo(city_first) < 0 && city_second.compareTo(city_third) < 0) {

			if (city_first.compareTo(city_third) < 0) {
				result = city_second + " " + city_first + " " + city_third;
			} else {
				result = city_second + " " + city_third + " " + city_first;
			}
		} else {

			if (city_second.compareTo(city_first) < 0) {
				result = city_third + " " + city_second + " " + city_first;
			} else {
				result = city_third + " " + city_first + " " + city_second;
			}
		}

		System.out.println("The three cities in alphabetical order are " + result);
	}
}
