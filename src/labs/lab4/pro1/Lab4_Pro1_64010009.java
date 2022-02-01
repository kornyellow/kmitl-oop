package labs.lab4.pro1;

import classes.Stock;

public class Lab4_Pro1_64010009 {

	public static void main(String[] args) {

		Stock stock = new Stock("ORCL", "Oracle Cooperation");
		stock.previous_closing_price = 34.5;
		stock.current_price = 34.35;

		System.out.println("Symbol: " + stock.symbol);
		System.out.println("Name: " + stock.name);
		System.out.println("Previous Closing Price: " + stock.previous_closing_price);
		System.out.println("Current Price: " + stock.current_price);
		System.out.println("Price Change: " + stock.getChangePercent() + "%");
	}
}