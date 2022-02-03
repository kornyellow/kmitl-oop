package labs.lab7.pro7;

import java.math.BigInteger;

public class Lab7_Pro7_64010009 {

	public static void main(String[] args) {

		System.out.println(solution("15"));
	}

	public static int solution(String n) {

		BigInteger big_int = new BigInteger(n);

		int answer = 0;

		while (big_int.compareTo(BigInteger.ONE) != 0) {

			if (big_int.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0)
				big_int = big_int.divide(BigInteger.TWO);

			else {

				if (big_int.subtract(BigInteger.ONE).
					mod(BigInteger.valueOf(4)).
					equals(BigInteger.ZERO) || big_int.equals(BigInteger.valueOf(3)))
					big_int = big_int.subtract(BigInteger.ONE);
				else
					big_int = big_int.add(BigInteger.ONE);
			}
			answer++;
		}
		return answer;
	}
}
