package classes;

public class Rectangle extends GeometricObject implements Comparable {
	public Rectangle() {
		this.height = 1;
		this.width = 1;
	}

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public Rectangle(double width, double height, String color, boolean is_filled) {
		this.height = height;
		this.width = width;
		this.setColor(color);
		this.setIsFilled(is_filled);
	}

	@Override
	public int compareTo(Comparable comparable) {
		if (!(comparable instanceof Rectangle rectangle)) return 0;
		if (this.getArea() > rectangle.getArea()) return 1;
		else if (this.getArea() < rectangle.getArea()) return -1;
		return 0;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		return (this.width * 2) + (this.height * 2);
	}

	private double width;
	private double height;

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
