package labs.lab7.pro6;

public class Lab7_Pro6_64010009 {

	public static void main(String[] args) {

		System.out.println(solution(17, 4));
	}

	public static int solution(int start, int length) {

		int checksum = -1;
		int current = start;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {

				if (checksum == -1) checksum = current;
				else checksum ^= current;

				if (j == length - i - 1) break;
				current++;
			}
			current += i + 1;
		}

		return checksum;
	}
}
