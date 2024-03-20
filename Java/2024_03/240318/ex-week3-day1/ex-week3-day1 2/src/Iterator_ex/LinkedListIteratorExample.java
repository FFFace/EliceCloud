package Iterator_ex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIteratorExample {
	public static void main(String[] args) {
		List<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}
	}
}

