public class Tax {

	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	public Tax() {

		this.filing_status = SINGLE_FILER;
		this.brackets = new int[][]{
			{8350, 33950, 82250, 171550, 372950},
			{16700, 67900, 137050, 208850, 372950},
			{8350, 33950, 68525, 104425, 186475},
			{11950, 45500, 117450, 190200, 372950}
		};
		this.rates = new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.36};
		this.taxable_income = 400000;
	}

	public Tax(int filing_status, int[][] brackets, double[] rates, double taxable_income) {

		this.filing_status = filing_status;
		this.brackets = brackets;
		this.rates = rates;
		this.taxable_income = taxable_income;
	}

	public double getTax() {

		if (this.filing_status < 0 || this.filing_status > 3) {
			System.out.println("ERROR: filing status out of range");
			return -1;
		}
		if (this.brackets == null || this.brackets.length != 4) {
			System.out.println("ERROR: invalid brackets");
			return -1;
		}
		if (this.brackets[0].length != 5) {
			System.out.println("ERROR: invalid brackets");
			return -1;
		}
		if (this.rates == null || this.rates.length != 6) {
			System.out.println("ERROR: invalid rates");
			return -1;
		}
		if (this.taxable_income <= 0) {
			System.out.println("ERROR: taxable income must be more than zero");
			return -1;
		}

		if (this.taxable_income <= this.brackets[this.filing_status][0])
			return this.taxable_income * this.rates[0];

		if (this.taxable_income <= this.brackets[this.filing_status][1])
			return (this.brackets[this.filing_status][0] * this.rates[0]) +
				(this.taxable_income - this.brackets[this.filing_status][0]) * this.rates[1];

		if (this.taxable_income <= this.brackets[this.filing_status][2])
			return (this.brackets[this.filing_status][0] * this.rates[0]) +
				(this.brackets[this.filing_status][1] - this.brackets[this.filing_status][0]) * this.rates[1] +
				(this.taxable_income - this.brackets[this.filing_status][1]) * this.rates[2];

		if (this.taxable_income <= this.brackets[this.filing_status][3])
			return (this.brackets[this.filing_status][0] * this.rates[0]) +
				(this.brackets[this.filing_status][1] - this.brackets[this.filing_status][0]) * this.rates[1] +
				(this.brackets[this.filing_status][2] - this.brackets[this.filing_status][1]) * this.rates[2] +
				(this.taxable_income - this.brackets[this.filing_status][2]) * this.rates[3];

		if (this.taxable_income <= this.brackets[this.filing_status][4])
			return (this.brackets[this.filing_status][0] * this.rates[0]) +
				(this.brackets[this.filing_status][1] - this.brackets[this.filing_status][0]) * this.rates[1] +
				(this.brackets[this.filing_status][2] - this.brackets[this.filing_status][1]) * this.rates[2] +
				(this.brackets[this.filing_status][3] - this.brackets[this.filing_status][2]) * this.rates[3] +
				(this.taxable_income - this.brackets[this.filing_status][3]) * this.rates[4];

		return (this.brackets[this.filing_status][0] * this.rates[0]) +
			(this.brackets[this.filing_status][1] - this.brackets[this.filing_status][0]) * this.rates[1] +
			(this.brackets[this.filing_status][2] - this.brackets[this.filing_status][1]) * this.rates[2] +
			(this.brackets[this.filing_status][3] - this.brackets[this.filing_status][2]) * this.rates[3] +
			(this.brackets[this.filing_status][4] - this.brackets[this.filing_status][3]) * this.rates[4] +
			(this.taxable_income - this.brackets[this.filing_status][4]) * this.rates[5];
	}

	private int filing_status;
	private int[][] brackets;
	private double[] rates;
	private double taxable_income;

	public void setFilingStatus(int filing_status) {
		this.filing_status = filing_status;
	}

	public int getFilingStatus() {
		return this.filing_status;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public int[][] getBrackets() {
		return this.brackets;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public double[] getRates() {
		return this.rates;
	}

	public void setTaxableIncome(double taxable_income) {
		this.taxable_income = taxable_income;
	}

	public double getTaxableIncome() {
		return this.taxable_income;
	}
}
