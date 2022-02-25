package labs.lab6.pro1;

import classes.BMI;

import java.util.Scanner;

public class Lab6_Pro1_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input, name;
		double weight, height = -1;
		int feet = -1, inches = -1;
		int age, format;
		double weight_kilo, height_metre;

		System.out.println("--- BMI Calculator ---");

		while (true) {

			System.out.print("Enter your name and age: ");
			input = scanner.nextLine();

			if (!input.isBlank() && input.split(" ").length == 2) {

				String[] input_arr = input.split(" ");
				name = input_arr[0];
				age = Integer.parseInt(input_arr[1]);

				if (age > 0) break;
				System.out.println("ERROR: age input cannot be less than 1, try again!");
			}
			System.out.println("ERROR: invalid input, try again!");
		}
		while (true) {

			System.out.print("Weight (input format: 1=kg, 2=pound value): ");
			format = scanner.nextInt();

			if (format == 1 || format == 2) {

				weight = scanner.nextDouble();
				if (weight > 0) break;
				System.out.println("ERROR: weight input cannot be less than 1, try again!");
			} else System.out.println("ERROR: invalid format, try again!");
		}
		if (format == 1) weight_kilo = weight;
		else weight_kilo = BMI.convertPoundToKilo(weight);

		while (true) {

			System.out.print("Height (input format: 1=metre, 2=feet-inches): ");
			format = scanner.nextInt();

			if (format == 1 || format == 2) {

				if (format == 1) {

					height = scanner.nextDouble();
					if (height > 0) break;

				} else {

					feet = scanner.nextInt();
					inches = scanner.nextInt();
					if (feet > 0 && inches >= 0 && inches <= 11) break;
				}
				System.out.println("ERROR: invalid height input, try again!");
			} else System.out.println("ERROR: invalid format, try again!");
		}
		scanner.close();

		if (format == 1) height_metre = height;
		else height_metre = BMI.convertFeetToMetre(feet, inches);

		BMI bmi = new BMI(name, age, weight_kilo, height_metre);
		bmi.displayBMI();
	}
}
