public class RegularPolygon {

	public RegularPolygon() {

		this(3, 1, 0, 0);
	}

	public RegularPolygon(int n, double side) {

		this(n, side, 0, 0);
	}

	public RegularPolygon(int n, double side, double x, double y) {

		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	double getPerimeter() {

		return this.n * this.side;
	}

	double getArea() {

		return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
	}

	private int n;
	private double side;
	private double x;
	private double y;

	public int getN() {

		return this.n;
	}

	public void setN(int n) {

		this.n = n;
	}

	public double getSide() {

		return this.side;
	}

	public void setSide(double side) {

		this.side = side;
	}

	public double getX() {

		return this.x;
	}

	public void setX(double x) {

		this.x = x;
	}

	public double getY() {

		return this.y;
	}

	public void setY(double y) {

		this.y = y;
	}
}
