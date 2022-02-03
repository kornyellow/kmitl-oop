package labs.lab7.pro3;

public class Lab7_Pro3_64010009 {

	public static void main(String[] args) {

		System.out.println(answer("abcabcabcabc"));
	}

	public static int answer(String str) {

		int answer = -1;
		int length = str.length();

		for (int i = length; i > 0; i--) {

			int n = length / i;

			if (n * i == length) {

				boolean is_valid = true;
				String part = str.substring(0, n);

				for (int j = 1; j < i; j++) {

					if (!str.substring(j * n, j * n + n).equals(part)) {

						is_valid = false;
						break;
					}
				}

				if (is_valid) {

					answer = i;
					break;
				}
			}
		}
		return answer;
	}
}
