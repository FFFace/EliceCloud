package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPolymorphismExample {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("ArrayList item");

		List<String> linkedList = new LinkedList<>();
		linkedList.add("LinkedList item");

		printList(arrayList);
		printList(linkedList);
	}

	public static void printList(List<String> list) {
		for (String item : list) {
			System.out.println(item);
		}
	}
}
