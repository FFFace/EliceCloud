package encapsulation.ex01.after;

public class Timer {

	public long startTime;
	public long endTime;

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void end() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}




}
