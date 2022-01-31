import java.util.Scanner;

public class Lab6_Pro1_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name;
		int age, feet, inches;
		double weight;

		System.out.println("--- BMI Calculator ---");

		while (true) {

			System.out.print("Enter your name: ");
			name = scanner.nextLine();

			if (!name.isBlank()) break;
			System.out.println("ERROR: input cannot be empty");
		}
		while (true) {

			System.out.print("Enter your age: ");
			age = scanner.nextInt();

			if (age >= 1) break;
			System.out.println("ERROR: input cannot be less than 1");
		}
		while (true) {

			System.out.print("Enter your weight in pounds: ");
			weight = scanner.nextDouble();

			if (weight >= 1) break;
			System.out.println("ERROR: input cannot be less than 1");
		}
		while (true) {

			System.out.print("Enter your weight in feet and inches: ");
			feet = scanner.nextInt();
			inches = scanner.nextInt();

			if (feet >= 1 && inches >= 1 && inches <= 11) break;
			System.out.println("ERROR: inputs are invalid");
		}
		scanner.close();

		BMI user_bmi = new BMI(name, age, weight, feet, inches);
		user_bmi.displayBMI();
	}
}
