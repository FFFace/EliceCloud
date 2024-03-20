package encapsulation.ex01.after;

public class TimerTest {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.start();

		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}

		timer.end();

		long measureElaspedTime = timer.getElapsedTime();
		System.out.println("경과시간: " + measureElaspedTime + "ms");

	}
}
