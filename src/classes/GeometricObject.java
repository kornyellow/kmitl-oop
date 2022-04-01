package classes;

import java.util.Date;

public abstract class GeometricObject {
	protected GeometricObject() {
		this.date_created = new Date();
		this.color = "White";
		this.is_filled = false;
	}

	protected GeometricObject(String color, boolean is_filled) {
		this.date_created = new Date();
		this.color = color;
		this.is_filled = is_filled;
	}

	@Override
	public String toString() {
		return "Created on: " + this.date_created + "\n" +
			"\t- Color: " + this.color + "\n" +
			"\t- Filled: " + this.is_filled + "\n";
	}

	public static void displayObject(Object object) {
		if (object instanceof Triangle triangle) {
			System.out.println("Side1: " + triangle.getSide1());
			System.out.println("Side2: " + triangle.getSide2());
			System.out.println("Side3: " + triangle.getSide3());
			System.out.println("Area: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());
		} else if (object instanceof Rectangle rectangle) {
			System.out.println("Width: " + rectangle.getWidth());
			System.out.println("Height: " + rectangle.getHeight());
			System.out.println("Area: " + rectangle.getArea());
			System.out.println("Perimeter: " + rectangle.getPerimeter());
		} else if (object instanceof Circle circle) {
			System.out.println("Diameter: " + circle.getDiameter());
			System.out.println("Area: " + circle.getArea());
			System.out.println("Perimeter: " + circle.getPerimeter());
		} else {
			System.out.println("ERROR: invalid object");
		}
	}

	abstract public double getArea();

	abstract public double getPerimeter();

	protected String color;
	protected boolean is_filled;
	protected final Date date_created;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return is_filled;
	}

	public void setIsFilled(boolean is_filled) {
		this.is_filled = is_filled;
	}

	public Date getDateCreated() {
		return date_created;
	}
}
