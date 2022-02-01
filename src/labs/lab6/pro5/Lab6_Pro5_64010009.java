package labs.lab6.pro5;

import classes.Tax;

public class Lab6_Pro5_64010009 {

	public static void main(String[] args) {

		final double TAXABLE_INCOME = 400000;

		Tax tax = new Tax(
			Tax.SINGLE_FILER,
			new int[][]{
				{8350, 33950, 82250, 171550, 372950},
				{16700, 67900, 137050, 208850, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}
			},
			new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.36},
			TAXABLE_INCOME
		);

		System.out.printf("classes.Tax for taxable income of %.2f is %.2f\n", TAXABLE_INCOME, tax.getTax());
	}
}
