package labs.lab6.pro4;

import java.util.Scanner;

public class Lab6_Pro4_64010009 {

	static final double[] RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.36};

	static final int[][] BRACKETS = {
		{8350, 33950, 82250, 171550, 372950},
		{16700, 67900, 137050, 208850, 372950},
		{8350, 33950, 68525, 104425, 186475},
		{11950, 45500, 117450, 190200, 372950}
	};

	public static void main(String[] args) {

		int status;
		double income;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Filing Status");
		System.out.println("\t[0]-Single filer");
		System.out.println("\t[1]-Married jointly or qualifying widow[er]");
		System.out.println("\t[2]-Married separately");
		System.out.println("\t[3]-Head of household");

		while (true) {

			System.out.print("Enter the filing status: ");
			status = scanner.nextInt();

			if (status >= 0 && status <= 3) break;
			System.out.println("ERROR: input out of range, try again!");
		}
		while (true) {

			System.out.print("Enter the taxable income: ");
			income = scanner.nextDouble();

			if (income > 0) break;
			System.out.println("ERROR: input must be more than zero");
		}
		scanner.close();

		System.out.printf("Tax is %.2f\n", computeTax(status, income));
	}

	private static double computeTax(int status, double income) {

		if (income <= BRACKETS[status][0])
			return income * RATES[0];

		if (income <= BRACKETS[status][1])
			return (BRACKETS[status][0] * RATES[0]) +
				(income - BRACKETS[status][0]) * RATES[1];

		if (income <= BRACKETS[status][2])
			return (BRACKETS[status][0] * RATES[0]) +
				(BRACKETS[status][1] - BRACKETS[status][0]) * RATES[1] +
				(income - BRACKETS[status][1]) * RATES[2];

		if (income <= BRACKETS[status][3])
			return (BRACKETS[status][0] * RATES[0]) +
				(BRACKETS[status][1] - BRACKETS[status][0]) * RATES[1] +
				(BRACKETS[status][2] - BRACKETS[status][1]) * RATES[2] +
				(income - BRACKETS[status][2]) * RATES[3];

		if (income <= BRACKETS[status][4])
			return (BRACKETS[status][0] * RATES[0]) +
				(BRACKETS[status][1] - BRACKETS[status][0]) * RATES[1] +
				(BRACKETS[status][2] - BRACKETS[status][1]) * RATES[2] +
				(BRACKETS[status][3] - BRACKETS[status][2]) * RATES[3] +
				(income - BRACKETS[status][3]) * RATES[4];

		return (BRACKETS[status][0] * RATES[0]) +
			(BRACKETS[status][1] - BRACKETS[status][0]) * RATES[1] +
			(BRACKETS[status][2] - BRACKETS[status][1]) * RATES[2] +
			(BRACKETS[status][3] - BRACKETS[status][2]) * RATES[3] +
			(BRACKETS[status][4] - BRACKETS[status][3]) * RATES[4] +
			(income - BRACKETS[status][4]) * RATES[5];
	}
}
