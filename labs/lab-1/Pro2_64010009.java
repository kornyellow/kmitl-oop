import java.util.Scanner;

public class Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double a, b, c, d, e, f, x, y;

		System.out.print("Enter value of a: ");
		a = scanner.nextDouble();

		System.out.print("Enter value of b: ");
		b = scanner.nextDouble();

		System.out.print("Enter value of c: ");
		c = scanner.nextDouble();

		System.out.print("Enter value of d: ");
		d = scanner.nextDouble();

		System.out.print("Enter value of e: ");
		e = scanner.nextDouble();

		System.out.print("Enter value of f: ");
		f = scanner.nextDouble();

		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));

		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);

		scanner.close();
	}
}
