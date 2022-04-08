package labs.lab9.pro2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Lab9_Pro2_64010009 {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<String> ranks = new ArrayList<>();
		ranks.add("assistant");
		ranks.add("associate");
		ranks.add("full");

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Salary.txt"));

			for (int i = 1; i <= 1000; i++) {
				String rank = ranks.get(random.nextInt(0, 3));
				double salary;
				if (rank.equals("assistant")) {
					salary = Math.round(random.nextDouble(50000, 80000) * 100.0) / 100.0;
				} else if (rank.equals("associate")) {
					salary = Math.round(random.nextDouble(60000, 110000) * 100.0) / 100.0;
				} else {
					salary = Math.round(random.nextDouble(75000, 130000) * 100.0) / 100.0;
				}
				writer.append("FirstName").append(String.valueOf(i)).append(" ");
				writer.append("Lastname").append(String.valueOf(i)).append(" ");
				writer.append(rank).append(" ");
				writer.append(String.valueOf(salary));
				if (i != 1000) writer.append("\n");
			}
			writer.close();
			System.out.println("Successfully write to file");

		} catch (IOException e) {
			System.out.println("ERROR: cannot process file (" + e.getMessage() + ")");
		}
	}
}
