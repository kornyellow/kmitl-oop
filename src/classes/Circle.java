package classes;

public class Circle extends GeometricObject implements Comparable {
	public Circle() {
		this.radius = 1;
		this.color = "White";
		this.is_filled = false;
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "White";
		this.is_filled = false;
	}

	public Circle(double radius, String color, boolean is_filled) {
		this.radius = radius;
		this.color = color;
		this.is_filled = is_filled;
	}

	@Override
	public double getArea() {
		return Math.PI * (this.radius * this.radius);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public int compareTo(Comparable comparable) {
		Circle circle = (Circle) comparable;
		if (this.getArea() > circle.getArea()) return 1;
		else if (this.getArea() < circle.getArea()) return -1;
		return 0;
	}

	public double getDiameter() {
		return this.radius * 2;
	}

	private double radius;

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
