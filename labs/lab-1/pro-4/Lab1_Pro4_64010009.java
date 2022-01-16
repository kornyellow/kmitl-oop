import java.util.Scanner;

public class Lab1_Pro4_64010009 {

	public static void main(String[] args) {

		final double KILO_PER_POUND = 0.45359237;
		final double INCH_PER_METER = 0.0254;

		Scanner scanner = new Scanner(System.in);

		double weight, height, bmi;

		System.out.print("Enter weight in pounds: ");
		weight = scanner.nextDouble();

		System.out.print("Enter height in inches: ");
		height = scanner.nextDouble();
		scanner.close();

		if (weight > 0 && height > 0) {

			weight *= KILO_PER_POUND;
			height *= INCH_PER_METER;
			bmi = weight / (height * height);

			System.out.println("BMI is " + bmi);

		} else System.out.println("ERROR: inputs cannot be less than zero");
	}
}
