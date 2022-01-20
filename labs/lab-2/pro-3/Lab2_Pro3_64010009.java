import java.util.Scanner;

public class Lab2_Pro3_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int year, month, day;

		while (true) {

			System.out.print("Enter a year: (e.g., 2012): ");
			year = scanner.nextInt();

			if (year > 0) break;
			System.out.println("ERROR: invalid year");
		}
		while (true) {

			System.out.print("Enter a month: 1-12: ");
			month = scanner.nextInt();

			if (month >= 1 && month <= 12) break;
			System.out.println("ERROR: invalid month");
		}
		while (true) {

			System.out.print("Enter day of the month: 1-31: ");
			day = scanner.nextInt();

			if (day >= 1 && day <= 31) break;
			System.out.println("ERROR: invalid day");
		}
		scanner.close();

		if (month <= 2) {

			month += 12;
			year--;
		}

		int h, q, m, j, k;
		q = day;
		m = month;
		j = year / 100;
		k = year % 100;
		h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		String day_str;

		if (h == 0) day_str = "Saturday";
		else if (h == 1) day_str = "Sunday";
		else if (h == 2) day_str = "Monday";
		else if (h == 3) day_str = "Tuesday";
		else if (h == 4) day_str = "Wednesday";
		else if (h == 5) day_str = "Thursday";
		else day_str = "Friday";

		System.out.println("Day of the week is " + day_str);
	}
}
