package labs.lab8.pro2;

import classes.GeometricObject;
import classes.Square;

import java.util.Random;

public class Lab8_Pro2_64010009 {

	public static void main(String[] args) {

		Random random = new Random();

		GeometricObject[] objects = new GeometricObject[5];
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Square(random.nextDouble() * 9);
		}

		for (GeometricObject object : objects) {
			Square square = (Square) object;
			System.out.println("Area: " + square.getArea());
			System.out.println("Perimeter: " + square.getPerimeter());
			System.out.println("How to Color: ");
			square.howToColor();
			System.out.println();
		}
	}
}
