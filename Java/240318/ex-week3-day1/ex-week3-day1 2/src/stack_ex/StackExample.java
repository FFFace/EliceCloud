package stack_ex;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();

		// 요소를 스택에 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// 스택의 최상단 요소 확인
		System.out.println("스택의 최상단: " + stack.peek());

		// 스택이 비어있을 때까지 요소를 꺼내고 출력
		while (!stack.isEmpty()) {
			System.out.println("꺼내진 요소: " + stack.pop());
		}
	}
}
