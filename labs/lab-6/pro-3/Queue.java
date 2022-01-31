public class Queue {

	public Queue() {

		this.size = 8;
		this.n = 0;

		this.elements = new int[this.size];
	}

	public void display() {

		if (this.n != 0) {

			for (int i = 0; i < this.n; i++) {

				if (i != this.n - 1) System.out.print(this.elements[i] + ", ");
				else System.out.print(this.elements[i]);
			}

		} else System.out.print("-");
		
		System.out.print("\n");
	}

	public void enqueue(int v) {

		if (this.n == this.size) {

			this.size *= 2;

			int[] old_elements = this.elements;
			this.elements = new int[this.size];

			System.arraycopy(old_elements, 0, this.elements, 0, old_elements.length);
		}

		this.elements[n] = v;
		this.n++;
	}

	public int dequeue() {

		if (this.n == 0) return -1;

		int result = this.elements[0];

		for (int i = 0; i < this.n; i++) {

			if (i == this.n - 1) this.elements[i] = 0;
			else this.elements[i] = this.elements[i + 1];
		}

		this.n--;

		return result;
	}

	public boolean isEmpty() {

		return this.n == 0;
	}

	public int getSize() {

		return this.size;
	}

	private int[] elements;
	private int n;
	private int size;
}
