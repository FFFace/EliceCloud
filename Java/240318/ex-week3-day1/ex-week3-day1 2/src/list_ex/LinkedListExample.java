package list_ex;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		numbers.add(1, 4); // 인덱스 1에 값 4 추가

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
