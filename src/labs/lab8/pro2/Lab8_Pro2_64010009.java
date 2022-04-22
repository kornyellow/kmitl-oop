package labs.lab8.pro2;

import classes.Circle;
import classes.Rectangle;

import java.util.Scanner;

public class Lab8_Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double circleRadius1, circleRadius2;
		while (true) {
			System.out.print("Creating circle 1, input radius: ");
			circleRadius1 = scanner.nextDouble();

			if (circleRadius1 > 0) break;
			System.out.println("ERROR: invalid input, try again!");
		}
		while (true) {
			System.out.print("Creating circle 2, input radius: ");
			circleRadius2 = scanner.nextDouble();

			if (circleRadius2 > 0) break;
			System.out.println("ERROR: invalid input, try again!");
		}
		System.out.println("------------------------");
		Circle circle1 = new Circle(circleRadius1);
		Circle circle2 = new Circle(circleRadius2);

		if (circle1.compareTo(circle2) == 1) {
			System.out.printf("The max circle's radius is %.1f\n", circle1.getRadius());
		} else {
			System.out.printf("The max circle's radius is %.1f\n", circle2.getRadius());
		}
		System.out.println("========================");

		double rectangleWidth1, rectangleHeight1;
		double rectangleWidth2, rectangleHeight2;
		while (true) {
			System.out.print("Creating rectangle 1, input width and height: ");
			rectangleWidth1 = scanner.nextDouble();
			rectangleHeight1 = scanner.nextDouble();

			if (rectangleWidth1 > 0 && rectangleHeight1 > 0) break;
			System.out.println("ERROR: invalid input, try again!");
		}
		while (true) {
			System.out.print("Creating rectangle 2, input width and height: ");
			rectangleWidth2 = scanner.nextDouble();
			rectangleHeight2 = scanner.nextDouble();

			if (rectangleWidth2 > 0 && rectangleHeight2 > 0) break;
			System.out.println("ERROR: invalid input, try again!");
		}
		System.out.println("------------------------");
		Rectangle rectangle1 = new Rectangle(rectangleWidth1, rectangleHeight1);
		Rectangle rectangle2 = new Rectangle(rectangleWidth2, rectangleHeight2);

		if (rectangle1.compareTo(rectangle2) == 1) {
			System.out.printf("The max rectangle's width and height are %.1f, %.1f\n",
				rectangle1.getWidth(),
				rectangle1.getHeight()
			);
		} else {
			System.out.printf("The max rectangle's width and height are %.1f, %.1f\n",
				rectangle2.getWidth(),
				rectangle2.getHeight()
			);
		}
		System.out.println("========================");

		scanner.close();
	}
}
