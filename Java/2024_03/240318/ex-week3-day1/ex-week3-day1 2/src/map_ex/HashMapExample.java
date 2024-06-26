package map_ex;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> ageMap = new HashMap<>();
		ageMap.put("elice", 30);
		ageMap.put("Bob", 25);
		ageMap.put("Charlie", 22);
		ageMap.put("elice", 31); // "Alice"의 값이 업데이트됨

		for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}

