package classes;

public class Triangle extends GeometricObject {

	public Triangle() {
		this.side1 = 1;
		this.side2 = 2;
		this.side3 = 3;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double getArea() {
		double s = 0.5 * (this.side1 + this.side2 + this.side3);
		return Math.sqrt(s * ((s - this.side1) * (s - this.side2) * (s - this.side3)));
	}

	@Override
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	public void display() {
		System.out.println("Triangle:");
		System.out.println("\t- Area: " + this.getArea());
		System.out.println("\t- Perimeter: " + this.getPerimeter());
		System.out.println("\t- Color: " + this.getColor());
		System.out.println("\t- Filled: " + this.isFilled());
	}

	private final double side1;
	private final double side2;
	private final double side3;

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
}
