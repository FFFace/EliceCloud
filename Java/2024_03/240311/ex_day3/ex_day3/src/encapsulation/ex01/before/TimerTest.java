package encapsulation.ex01.before;

public class TimerTest {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.startTime = System.currentTimeMillis();

		// 프로그램 실행
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}

		timer.endTime = System.currentTimeMillis();

		long estimatedTime = timer.endTime - timer.startTime;
		System.out.println("경과시간: " + estimatedTime + "ms");

	}
}
