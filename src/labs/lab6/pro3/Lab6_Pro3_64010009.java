package labs.lab6.pro3;

import classes.Queue;

public class Lab6_Pro3_64010009 {

	public static void main(String[] args) {

		Queue queue = new Queue();

		for (int i = 1; i <= 20; i++) queue.enqueue(i);
		System.out.print("Elements after enqueue: ");
		queue.display();

		for (int i = 0; i < 20; i++) queue.dequeue();
		System.out.print("Elements after dequeue: ");
		queue.display();
	}
}
