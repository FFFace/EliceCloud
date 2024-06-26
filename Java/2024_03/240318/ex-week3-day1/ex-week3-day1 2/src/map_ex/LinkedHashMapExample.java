package map_ex;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap은 요소를 추가한 순서대로 순회함.
public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> orderMap = new LinkedHashMap<>();
		orderMap.put("First", 1);
		orderMap.put("Second", 2);
		orderMap.put("Third", 3);

		for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}

