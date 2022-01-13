import java.util.Scanner;

public class Program5 {

	static int lines = -1;

	public static void main(String args[]) {

		Program5.getUserInput();
		Program5.printPyramid();
	}

	static void getUserInput() {

		Scanner scanner = new Scanner(System.in);

		while(lines < 1 || lines > 15) {

			System.out.print("Enter the number of lines: ");
			lines = scanner.nextInt();
		}

		scanner.close();
	}

	static void printPyramid() {

		for(int y = 0; y < lines; y++) {

			for(int x = -lines + 1; x <= lines - 1; x++) {

				if(y >= Math.abs(x)) System.out.print((Math.abs(x) + 1) + " ");
				else System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
}
