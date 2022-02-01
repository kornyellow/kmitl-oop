package classes;

public class SelectionSort {

	public static void sort(float[] list) {

		int sorted_ptr, current_ptr, minimum_ptr;
		sorted_ptr = current_ptr = minimum_ptr = 0;

		while (sorted_ptr != list.length) {

			if (list[current_ptr] < list[minimum_ptr]) minimum_ptr = current_ptr;
			else {

				current_ptr++;
				if (current_ptr == list.length) {

					float temp = list[sorted_ptr];
					list[sorted_ptr] = list[minimum_ptr];
					list[minimum_ptr] = temp;

					sorted_ptr++;
					current_ptr = minimum_ptr = sorted_ptr;
				}
			}
		}
	}
}
