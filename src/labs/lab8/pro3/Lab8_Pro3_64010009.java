package labs.lab8.pro3;

import classes.Rectangle;

import java.util.Scanner;

public class Lab8_Pro3_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double width1, width2, height1, height2;
		while (true) {
			System.out.print("Enter first rectangle's width and height: ");
			width1 = scanner.nextDouble();
			height1 = scanner.nextDouble();
			if (width1 > 0 && height1 > 0) break;
			System.out.println("ERROR: invalid inputs, try again!");
		}
		while (true) {
			System.out.print("Enter second rectangle's width and height: ");
			width2 = scanner.nextDouble();
			height2 = scanner.nextDouble();
			if (width2 > 0 && height2 > 0) break;
			System.out.println("ERROR: invalid inputs, try again!");
		}

		Rectangle rectangle1 = new Rectangle(width1, height1);
		Rectangle rectangle2 = new Rectangle(width2, height2);

		System.out.println();
		System.out.println("The first rectangle area is " + rectangle1.getArea());
		System.out.println("The second rectangle area is " + rectangle2.getArea());

		System.out.print("Such that first and second rectangle is ");
		if (rectangle1.compareTo(rectangle2) == 0) {
			System.out.println("equal.");
		} else System.out.println("not equal.");
	}
}
