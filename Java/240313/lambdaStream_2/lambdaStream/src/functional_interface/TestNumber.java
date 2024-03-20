package functional_interface;

@FunctionalInterface // 함수형 인터페이스임을 명시
interface MyNumber {
	// 두 정수 중 더 작은 값을 반환하는 추상 메소드
	int getMin(int x, int y);
}

public class TestNumber {

	public static void main(String[] args) {
		// 람다식을 사용하여 MyNumber 인터페이스의 구현체 생성
		// 두 매개변수 중 더 작은 값을 반환
		MyNumber min = (x, y) -> (x <= y) ? x : y;

		// 구현체를 사용하여 getMin 메소드 호출
		System.out.println(min.getMin(10, 20)); // 10 출력
	}
}
