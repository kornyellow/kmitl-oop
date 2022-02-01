package labs.lab2.pro5;

public class Lab2_Pro5_64010009 {

	public static void main(String[] args) {

		final int MAX_PRINT_NUMBER = 100;

		int sequence_first = 1;
		int sequence_second = 3;

		int first_set_increment = 2;
		boolean is_first_set = true;

		int number_count = 1;

		while (number_count < MAX_PRINT_NUMBER) {

			if (is_first_set) {

				System.out.print(sequence_first + ", ");
				sequence_first += first_set_increment;
				first_set_increment += 2;

			} else {

				System.out.print(sequence_second + ", ");
				sequence_second += 3;
			}

			is_first_set = !is_first_set;
			number_count++;
		}

		if (is_first_set) System.out.print(sequence_first);
		else System.out.print(sequence_second);
	}
}
