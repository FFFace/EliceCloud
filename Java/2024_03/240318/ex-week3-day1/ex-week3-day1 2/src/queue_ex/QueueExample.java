package queue_ex;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// Queue 인터페이스의 구현체인 LinkedList 생성
		Queue<String> queue = new LinkedList<>();

		// 요소 추가
		queue.offer("Elice");
		queue.offer("Bob");
		queue.offer("Charlie");

		// 큐의 맨 앞 요소 확인
		System.out.println("Queue의 맨 앞: " + queue.peek());

		// 큐에서 요소 제거하면서 요소 반환
		while (!queue.isEmpty()) {
			String name = queue.poll(); // 큐에서 요소를 제거하고 반환
			System.out.println("처리된 요소: " + name);
		}

		// 최종적으로 큐가 비어있는지 확인
		System.out.println("Queue가 비어있는가? " + queue.isEmpty());
	}
}

