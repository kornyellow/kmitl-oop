public class List {

	public static void displayFiveElementsFromList(float[] list, int offset) {

		for (int i = 0; i < 5; i++) {
			System.out.printf("%10.2f", list[offset + i]);
		}
		System.out.print("\n");
	}

	public static void displayList(float[] list) {

		displayFiveElementsFromList(list, 0);
		displayFiveElementsFromList(list, 5);
		System.out.printf("%50s\n", "....");
		displayFiveElementsFromList(list, list.length - 10);
		displayFiveElementsFromList(list, list.length - 5);
	}

	public static float[] createRandomListOfNumbers(int max_elements) {

		float[] numbers_list = new float[max_elements];

		for (int i = 0; i < max_elements; i++) {

			numbers_list[i] = (float) (Math.random() * max_elements);
		}

		System.out.println("Creating a list containing " + max_elements + " elements,");
		displayList(numbers_list);
		System.out.println("List created.");

		return numbers_list;
	}
}
