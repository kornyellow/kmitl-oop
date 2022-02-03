package labs.lab7.pro5;

import java.util.Arrays;

public class Lab7_Pro5_64010009 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(new int[]{4, 30, 50})));
		System.out.println(Arrays.toString(solution(new int[]{4, 17, 50})));
		System.out.println(Arrays.toString(solution(new int[]{1, 51})));
		System.out.println(Arrays.toString(solution(new int[]{1, 31})));
		System.out.println(Arrays.toString(solution(new int[]{1, 31, 51, 71})));
		System.out.println(Arrays.toString(solution(new int[]{1, 31, 51, 71, 91})));
		System.out.println(Arrays.toString(solution(new int[]{4, 9, 17, 31, 40})));
	}

	public static int[] solution(int[] pegs) {

		int length = pegs.length;
		if (length < 2) return new int[]{-1, -1};

		boolean is_even = (pegs.length % 2 == 0);

		int sum;
		if (is_even) sum = (-pegs[0] + pegs[length - 1]);
		else sum = (-pegs[0] - pegs[length - 1]);

		if (length > 2) {

			for (int i = 1; i < length - 1; i++)
				sum += 2 * Math.pow(-1, i + 1) * pegs[i];
		}

		int numerator, denominator;
		float first_radius;
		first_radius = (2 * sum);
		numerator = sum * 2;
		if (is_even) {
			first_radius /= 3.0f;
			denominator = 3;
		} else {
			denominator = 1;
		}

		if (numerator % denominator == 0) {
			numerator /= denominator;
			denominator = 1;
		}

		// Impossible
		if (first_radius <= 1) return new int[]{-1, -1};

		float check_radius = first_radius;
		for (int i = 0; i < length - 2; i++) {

			float dist = pegs[i + 1] - pegs[i];
			float next_radius = dist - check_radius;

			// Impossible
			if (next_radius < 1) {
				return new int[]{-1, -1};
			} else check_radius = next_radius;
		}

		return new int[]{numerator, denominator};
	}
}