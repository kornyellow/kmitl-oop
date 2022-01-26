public class StopWatch {

	public StopWatch() {

		this.start();
	}

	public void start() {

		this.start_time = System.nanoTime();
	}

	public void stop() {

		this.end_time = System.nanoTime();
	}

	public long getElapsedTime() {

		return this.end_time - this.start_time;
	}

	private long start_time;
	private long end_time;

	public long getStartTime() {

		return this.start_time;
	}

	public long getEndTime() {

		return this.end_time;
	}
}
