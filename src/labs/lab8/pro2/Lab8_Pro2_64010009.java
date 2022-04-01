package labs.lab8.pro2;

import classes.Circle;
import classes.Rectangle;

import java.util.Scanner;

public class Lab8_Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double circle_radius_1, circle_radius_2, circle_radius_max;

		while (true) {
			System.out.print("Creating circle 1, input radius: ");
			circle_radius_1 = scanner.nextDouble();
			if (circle_radius_1 > 0) break;
			System.out.println("ERROR: invalid input, try again!");
		}
		while (true) {
			System.out.print("Creating circle 2, input radius: ");
			circle_radius_2 = scanner.nextDouble();
			if (circle_radius_2 > 0) break;
			System.out.println("ERROR: invalid input, try again!");
		}
		System.out.println("------------------------");

		Circle circle_1 = new Circle(circle_radius_1);
		Circle circle_2 = new Circle(circle_radius_2);

		circle_radius_max = circle_radius_1;
		if (circle_2.compareTo(circle_1) == 1) circle_radius_max = circle_radius_2;

		System.out.println("The max circle's radius is " + circle_radius_max);
		System.out.println("========================");

		double rectangle_width_1, rectangle_height_1;
		double rectangle_width_2, rectangle_height_2;

		while (true) {
			System.out.print("Creating rectangle 1, input width and height: ");
			rectangle_width_1 = scanner.nextDouble();
			rectangle_height_1 = scanner.nextDouble();
			if (rectangle_width_1 > 0 && rectangle_height_1 > 0) break;
			System.out.println("ERROR: invalid inputs, try again!");
		}
		while (true) {
			System.out.print("Creating rectangle 2, input width and height: ");
			rectangle_width_2 = scanner.nextDouble();
			rectangle_height_2 = scanner.nextDouble();
			if (rectangle_width_2 > 0 && rectangle_height_2 > 0) break;
			System.out.println("ERROR: invalid inputs, try again!");
		}
		System.out.println("------------------------");

		scanner.close();

		Rectangle rectangle_1 = new Rectangle(rectangle_width_1, rectangle_height_1);
		Rectangle rectangle_2 = new Rectangle(rectangle_width_2, rectangle_height_2);

		if (rectangle_1.compareTo(rectangle_2) == 1) {
			System.out.printf("The max rectangle's width and height are %.1f, %.1f\n",
				rectangle_1.getWidth(),
				rectangle_1.getHeight()
			);
		} else {
			System.out.printf("The max rectangle's width and height are %.1f, %.1f\n",
				rectangle_2.getWidth(),
				rectangle_2.getHeight()
			);
		}
		System.out.println("========================");
	}
}
