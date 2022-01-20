import java.util.Scanner;

public class Lab2_Pro4_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number_of_lines;

		while (true) {

			System.out.print("Enter the number of lines: ");
			number_of_lines = scanner.nextInt();

			if (number_of_lines >= 1) break;
			System.out.println("ERROR: input cannot be less than one");
		}
		scanner.close();

		for (int y = 0; y < number_of_lines; y++) {
			for (int x = -number_of_lines + 1; x <= number_of_lines - 1; x++) {

				if (y >= Math.abs(x)) System.out.print((Math.abs(x) + 1) + " ");
				else System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
}
