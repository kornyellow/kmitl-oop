package labs.lab3.pro2;

import java.util.Scanner;

public class Lab3_Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String list1_str, list2_str;

		while (true) {

			System.out.print("Enter list1: ");
			list1_str = scanner.nextLine();

			if (!list1_str.isBlank() && list1_str.replace(" ", "").matches("[0-9]+") && isSorted(stringToList(list1_str)))
				break;

			System.out.println("ERROR: invalid input");
		}
		while (true) {

			System.out.print("Enter list2: ");
			list2_str = scanner.nextLine();

			if (!list2_str.isBlank() && list2_str.replace(" ", "").matches("[0-9]+") && isSorted(stringToList(list2_str)))
				break;

			System.out.println("ERROR: invalid input");
		}
		scanner.close();

		int[] list1 = stringToList(list1_str);
		int[] list2 = stringToList(list2_str);

		int[] merged_list = merge(list1, list2);

		System.out.print("The merged list is ");
		for (int element : merged_list) System.out.print(element + " ");
	}

	public static int[] merge(int[] list1, int[] list2) {

		int[] merge_list = new int[list1.length + list2.length];

		int list1_ptr = 0;
		int list2_ptr = 0;

		while (list1_ptr < list1.length && list2_ptr < list2.length)
			merge_list[list1_ptr + list2_ptr] = list1[list1_ptr] < list2[list2_ptr] ? list1[list1_ptr++] : list2[list2_ptr++];

		while (list1_ptr < list1.length)
			merge_list[list1_ptr + list2_ptr] = list1[list1_ptr++];

		while (list2_ptr < list2.length)
			merge_list[list1_ptr + list2_ptr] = list2[list2_ptr++];

		return merge_list;
	}

	public static boolean isSorted(int[] sorted_list) {

		if (sorted_list.length == 1) return true;

		int temp = sorted_list[0];
		for (int i = 1; i < sorted_list.length; i++) {

			if (sorted_list[i] < temp) return false;
			temp = sorted_list[i];
		}

		return true;
	}

	public static int[] stringToList(String list_str) {

		String[] list_arr = list_str.trim().split(" ");
		int[] list = new int[list_arr.length];

		for (int i = 0; i < list.length; i++) list[i] = Integer.parseInt(list_arr[i]);

		return list;
	}
}