package classes;

public class Square extends GeometricObject implements Colorable {
	public Square() {
		this.height = 1;
	}

	public Square(double height) {
		this.height = height;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	public double getArea() {
		return this.height * this.height;
	}

	@Override
	public double getPerimeter() {
		return this.height * 4;
	}

	private final double height;

	public double getHeight() {
		return height;
	}
}
