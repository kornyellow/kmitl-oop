package classes;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
	public Octagon() {
		this.side = 1;
	}

	public Octagon(double side) {
		this.side = side;
	}

	public Octagon(double side, String color, boolean is_filled) {
		this.side = side;
		this.setColor(color);
		this.setIsFilled(is_filled);
	}

	@Override
	public Octagon clone() {
		return new Octagon(this.side);
	}

	@Override
	public boolean compareTo(Comparable comparable) {
		Octagon octagon = (Octagon) comparable;
		return this.getArea() == octagon.getArea();
	}

	@Override
	public double getArea() {
		return (2 + (4 / (float) 22)) * this.side * this.side;
	}

	@Override
	public double getPerimeter() {
		return this.side * 8;
	}

	public void display() {

		System.out.println("Octagon: ");
		System.out.println("\t- Side: " + this.side);
		System.out.println("\t- Area: " + this.getArea());
		System.out.println("\t- Perimeter: " + this.getPerimeter());
	}

	private double side;

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
}
