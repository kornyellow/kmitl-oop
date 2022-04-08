package labs.lab9.pro1;

import classes.Triangle;

import java.util.Scanner;

public class Lab9_Pro1_64010009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Try to create the triangle!");
		double side1, side2, side3;

		System.out.print("Side1: ");
		side1 = scanner.nextDouble();
		System.out.print("Side2: ");
		side2 = scanner.nextDouble();
		System.out.print("Side3: ");
		side3 = scanner.nextDouble();

		scanner.close();

		try {
			Triangle triangle = new Triangle(side1, side2, side3);
			System.out.println("Congratulation! your triangle is valid!");
			System.out.println(triangle);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
