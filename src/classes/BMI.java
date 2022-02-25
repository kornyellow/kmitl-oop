package classes;

public class BMI {

	public BMI(String name, int age, double weight_kilo, double height_metre) {

		this.name = name;
		this.age = age;
		this.weight_kilo = weight_kilo;
		this.height_metre = height_metre;

		this.bmi = this.calculateBMI();
	}

	public void displayBMI() {

		String interpretation = BMI.getInterpretation(this.bmi);

		System.out.printf("Your BMI: %.2f\n", this.bmi);
		System.out.printf("Interpretation: %s weight\n", interpretation);
	}

	private double calculateBMI() {

		return this.weight_kilo / (this.height_metre * this.height_metre);
	}

	public static String getInterpretation(double bmi) {

		if (bmi < 18.5) return "Underweight";
		if (bmi < 25.0) return "Normal";
		if (bmi < 30.0) return "Overweight";
		return "Obese";
	}

	public static double convertPoundToKilo(double pounds) {

		return pounds * BMI.KILO_PER_POUND;
	}

	public static double convertFeetToMetre(int feet, int inches) {

		return ((feet * 12) + inches) * BMI.METRE_PER_INCH;
	}

	private static final double KILO_PER_POUND = 0.45359237;
	private static final double METRE_PER_INCH = 0.0254;

	private final String name;
	private final int age;
	private final double weight_kilo;
	private final double height_metre;
	private final double bmi;

	public String getName() {

		return this.name;
	}

	public int getAge() {

		return this.age;
	}

	public double getWeightKilo() {

		return weight_kilo;
	}

	public double getHeightMeter() {

		return height_metre;
	}

	public double getBMI() {

		return this.bmi;
	}
}
