public class Lab6_Pro4_64010009 {

	public static void main(String[] args) {

		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.36};

		int[][] brackets = {
				{8350, 33950, 82250, 171550, 372950},
				{16700, 67900, 137050, 208850, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}
		};

		double tax = (brackets[0][0] * rates[0]) +
				(brackets[0][1] - brackets[0][0]) * rates[1] +
				(brackets[0][2] - brackets[0][1]) * rates[2] +
				(brackets[0][3] - brackets[0][2]) * rates[3] +
				(brackets[0][4] - brackets[0][3]) * rates[4] +
				(400000 - brackets[0][4]) * rates[5];

		System.out.println(tax);
	}
}
