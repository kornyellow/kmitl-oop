package labs.lab8.pro2;

import classes.Triangle;

import java.util.Scanner;

public class Lab8_Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double side1, side2, side3;
		String color;
		String is_filled;

		while (true) {
			System.out.print("Input 3 sides of the triangle: ");
			side1 = scanner.nextDouble();
			side2 = scanner.nextDouble();
			side3 = scanner.nextDouble();
			if (side1 > 0 && side2 > 0 && side3 > 0) break;
			System.out.println("ERROR: invalid inputs, try again!");
		}

		System.out.print("The color is: ");
		color = scanner.next();

		while (true) {
			System.out.print("The triangle is filled (y/n): ");
			is_filled = scanner.next();
			if (is_filled.equals("y") || is_filled.equals("n")) break;
			System.out.println("ERROR: invalid input, try again!");
		}

		scanner.close();

		try {
			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.setColor(color);
			triangle.setIsFilled((is_filled.equals("y")));

			System.out.println("----------------------------");
			System.out.println(triangle);
			System.out.println("The area is " + triangle.getArea());
			System.out.println("The perimeter is " + triangle.getPerimeter());
			System.out.println("The color is " + triangle.getColor());
			System.out.println("Triangle is filled: " + triangle.isFilled());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
