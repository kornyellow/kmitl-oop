public class Pro2_64010009 {

	final static double A = 3.4;
	final static double B = 50.2;
	final static double C = 2.1;
	final static double D = 0.55;
	final static double E = 44.5;
	final static double F = 5.9;

	static double x = 0;
	static double y = 0;

	public static void main(String args[]) {

		Pro2_64010009.solveLinearEquation();

		System.out.printf("x = %.4f\n", x);
		System.out.printf("y = %.4f\n", y);
	}

	static void solveLinearEquation() {

		x = ((E*D) - (B*F)) / ((A*D) - (B*C));
		y = ((A*F) - (E*C)) / ((A*D) - (B*C));
	}
}
