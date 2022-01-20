import java.util.Scanner;

public class Lab2_Pro1_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int day_today, day_elapsed, day_future;

		while (true) {

			System.out.print("Enter today's day: ");
			day_today = scanner.nextInt();

			if (day_today >= 0 && day_today <= 6) break;
			System.out.println("ERROR: day out of range");
		}
		while (true) {

			System.out.print("Enter the number of days elapsed since today: ");
			day_elapsed = scanner.nextInt();

			if (day_elapsed >= 0) break;
			System.out.println("ERROR: number cannot be less than zero");
		}
		scanner.close();

		day_future = day_today + day_elapsed;
		day_future %= 7;

		String day_today_str, day_future_str;

		if (day_today == 0) day_today_str = "Sunday";
		else if (day_today == 1) day_today_str = "Monday";
		else if (day_today == 2) day_today_str = "Tuesday";
		else if (day_today == 3) day_today_str = "Wednesday";
		else if (day_today == 4) day_today_str = "Thursday";
		else if (day_today == 5) day_today_str = "Friday";
		else day_today_str = "Saturday";

		if (day_future == 0) day_future_str = "Sunday";
		else if (day_future == 1) day_future_str = "Monday";
		else if (day_future == 2) day_future_str = "Tuesday";
		else if (day_future == 3) day_future_str = "Wednesday";
		else if (day_future == 4) day_future_str = "Thursday";
		else if (day_future == 5) day_future_str = "Friday";
		else day_future_str = "Saturday";

		System.out.println("Today is " + day_today_str + " and the future day is " + day_future_str);
	}
}
