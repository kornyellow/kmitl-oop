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

	abstract public double getArea();

	abstract public double getPerimeter();

	private String color;
	private boolean is_filled;
	private final Date date_created;

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
