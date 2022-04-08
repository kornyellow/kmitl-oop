package labs.lab9.pro3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab9_Pro3_64010009 {
	public static void main(String[] args) {
		Map<String, Double> salaries = new HashMap<>();
		salaries.put("assistant", 0.0);
		salaries.put("associate", 0.0);
		salaries.put("full", 0.0);

		try {
			File file = new File("Salary.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String dataPerLine = scanner.nextLine();
				String[] data = dataPerLine.split(" ");
				if (salaries.containsKey(data[2]))
					salaries.put(data[2], salaries.get(data[2]) + Double.parseDouble(data[3]));
			}

			double salariesAll = salaries.get("assistant") + salaries.get("associate") + salaries.get("full");
			System.out.printf("Total salary for assistant professor is %,.2f\n", salaries.get("assistant"));
			System.out.printf("Total salary for associate professor is %,.2f\n", salaries.get("associate"));
			System.out.printf("Total salary for full professor is %,.2f\n", salaries.get("full"));
			System.out.printf("Total salary for all professor is %,.2f\n", salariesAll);
			System.out.println("-----------------------------------------------------");

			System.out.printf("Average salary for assistant professor is %,.2f\n", (salaries.get("assistant") / 1000));
			System.out.printf("Average salary for associate professor is %,.2f\n", (salaries.get("associate") / 1000));
			System.out.printf("Average salary for full professor is %,.2f\n", (salaries.get("full") / 1000));
			System.out.printf("Average salary for all professor is %,.2f\n", (salariesAll / 1000));

		} catch (FileNotFoundException e) {
			System.out.println("File not found (" + e.getMessage() + ")");
		}
	}
}
