package labs.lab8.pro1;

import classes.GeometricObject;
import classes.Triangle;

import java.util.Scanner;

public class Lab8_Pro1_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double side1, side2, side3;
		String color;
		boolean is_filled;

		while (true) {
			System.out.print("Enter three triangle sides (A B C): ");
			side1 = scanner.nextDouble();
			side2 = scanner.nextDouble();
			side3 = scanner.nextDouble();
			if (side1 > 0 && side2 > 0 && side3 > 0) break;
			System.out.println("ERROR: invalid inputs, try again!");
		}

		System.out.print("What color of a triangle: ");
		color = scanner.next();

		System.out.print("Does a triangle get filled (true/false): ");
		is_filled = scanner.nextBoolean();

		scanner.close();

		try {
			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.setColor(color);
			triangle.setIsFilled(is_filled);

			GeometricObject.displayObject(triangle);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
