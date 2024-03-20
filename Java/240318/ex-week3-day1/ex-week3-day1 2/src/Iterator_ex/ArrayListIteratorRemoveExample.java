package Iterator_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* ArrayList에 몇 가지 이름을 추가한 후,
* Iterator를 사용하여 리스트를 순회하면서
* 특정 조건("Bob")에 맞는 요소를 안전하게 제거함.
*  Iterator의 remove() 메서드를 사용하여
*  순회 중인 컬렉션에서 요소를 제거할 수 있음.
 * */

public class ArrayListIteratorRemoveExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Dave");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			if (name.equals("Bob")) {
				iterator.remove(); // "Bob" 요소 제거
			}
		}

		System.out.println("최종 리스트: " + names);
	}
}
