package main;

import classes.StopWatch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Lab {

	public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

		StopWatch stopwatch = new StopWatch();

		Scanner scanner = new Scanner(System.in);
		int lab_number;
		int program_number;

		if (args.length == 2) {

			lab_number = Integer.parseInt(args[0]);
			program_number = Integer.parseInt(args[1]);

		} else {

			System.out.print("Enter lab number: ");
			lab_number = scanner.nextInt();

			System.out.print("Enter program number: ");
			program_number = scanner.nextInt();
		}

		Class<?> lab = Class.forName("labs.lab" + lab_number + ".pro" + program_number + ".Lab" + lab_number + "_Pro" + program_number + "_64010009");
		Method main_method = lab.getMethod("main", String[].class);

		stopwatch.start();
		main_method.invoke(null, (Object) null);
		stopwatch.stop();
		System.out.printf("\n%.2fs", stopwatch.getElapsedTime() / 1000000000.f);
	}
}
