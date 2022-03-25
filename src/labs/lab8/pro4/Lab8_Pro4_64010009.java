package labs.lab8.pro4;

import classes.Octagon;

public class Lab8_Pro4_64010009 {

	public static void main(String[] args) {

		Octagon octagon = new Octagon(5);
		octagon.display();
		System.out.println();

		Octagon new_octagon = octagon.clone();
		new_octagon.display();
		System.out.println();

		System.out.print("Such that first and second octagon is ");
		if (octagon.compareTo(new_octagon)) {
			System.out.println("equal.");
		} else System.out.println("not equal.");
	}
}
