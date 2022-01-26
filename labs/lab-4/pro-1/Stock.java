public class Stock {

	String symbol;
	String name;
	double previous_closing_price;
	double current_price;

	public Stock(String symbol, String name) {

		this.symbol = symbol;
		this.name = name;
	}

	double getChangePercent() {

		return ((this.current_price - this.previous_closing_price) / this.previous_closing_price) * 100;
	}
}