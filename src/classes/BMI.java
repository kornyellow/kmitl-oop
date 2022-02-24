package classes;

public class BMI {

	public BMI(String name, int age, double weight, int feet, int inches) {

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;

		this.bmi = this.calculateBMI();
	}

	public void displayBMI() {

		double bmi = this.calculateBMI();
		String interpretation = BMI.getInterpretation(bmi);

		System.out.println("Display " + this.name + " BMI:");
		System.out.println("\t- Age: " + this.age + " years old");
		System.out.println("\t- Weight: " + this.weight + " pounds");
		System.out.println("\t- Height: " + this.feet + " feet and " + this.inches + " inches");
		System.out.println("\t- BMI: " + bmi + " (" + interpretation + ")");
	}

	private double calculateBMI() {

		double weight_kilo = this.weight * KILO_PER_POUND;
		double height_metre = (this.inches + (this.feet * 12)) * METRE_PER_INCH;

		return weight_kilo / (height_metre * height_metre);
	}

	public static String getInterpretation(double bmi) {

		if (bmi < 18.5) return "Underweight";
		if (bmi < 25.0) return "Normal";
		if (bmi < 30.0) return "Overweight";
		return "Obese";
	}

	private static final double KILO_PER_POUND = 0.45359237;
	private static final double METRE_PER_INCH = 0.0254;

	private final String name;
	private final int age;
	private final double weight;
	private final int feet;
	private final int inches;
	private final double bmi;

	public String getName() {

		return this.name;
	}

	public int getAge() {

		return this.age;
	}

	public double getWeight() {

		return this.weight;
	}

	public int getFeet() {

		return this.feet;
	}

	public int getInches() {

		return this.inches;
	}

	public double getBMI() {

		return this.bmi;
	}
}
