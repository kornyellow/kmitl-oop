import java.util.Scanner;

public class Pro4_64010009 {

	final static double KILO_PER_POUND = 0.45359237;
	final static double INCH_PER_METER = 0.0254;

	static double weight = -1;
	static double height = -1;
	static double bmi;

	public static void main(String args[]) {

		Pro4_64010009.getUserInput();
		Pro4_64010009.findBMI();

		System.out.printf("BMI is %.4f\n", bmi);
	}

	static void getUserInput() {

		Scanner scanner = new Scanner(System.in);

		while(weight < 0) {

			System.out.print("Enter weight in pounds: ");
			weight = scanner.nextDouble();
		}
		while(height <= 0) {

			System.out.print("Enter height in inches: ");
			height = scanner.nextDouble();
		}

		scanner.close();
	}

	static void findBMI() {

		weight *= KILO_PER_POUND;
		height *= INCH_PER_METER;
		bmi = weight / (height * height);
	}
}
