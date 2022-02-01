package classes;

public class Stock {

	public String symbol;
	public String name;
	public double previous_closing_price;
	public double current_price;

	public Stock(String symbol, String name) {

		this.symbol = symbol;
		this.name = name;
	}

	public double getChangePercent() {

		return ((this.current_price - this.previous_closing_price) / this.previous_closing_price) * 100;
	}
}