package labs.lab7.pro4;

import java.math.BigInteger;

public class Lab7_Pro4_64010009 {

	public static void main(String[] args) {

		System.out.println(Solution(new int[]{696, 254, 707, 730, 252, 144, 18, -678, 921, 681, -665, 421, -501, 204, 742, -609, 672, -72, 339, -555, -736, 230, -450, 375, 941, 50, 897, -192, -912, -915, 609, 100, -933, 458, -893, 932, -590, -209, 107, 473, -311, 73, 68, -229, 480, 41, -235, 558, -615, -289, -643}));
	}

	public static String Solution(int[] xs) {

		if (xs.length == 1) return String.valueOf(xs[0]);

		BigInteger maximum = BigInteger.valueOf(0);
		for (int i = 0; i < xs.length; i++) {

			if (xs[i] == 0) continue;

			BigInteger sum = BigInteger.valueOf(xs[i]);
			int least_negative = -1000;
			for (int j = 0; j < xs.length; j++) {

				if (xs[j] == 0 || j == i) continue;
				sum = sum.multiply(BigInteger.valueOf(xs[j]));
				if (xs[j] > least_negative && xs[j] < 0) least_negative = xs[j];
			}

			if (sum.compareTo(BigInteger.valueOf(0)) < 0) sum = sum.divide(BigInteger.valueOf(least_negative));
			if (sum.compareTo(maximum) > 0) maximum = sum;
		}
		return maximum.toString();
	}
}
