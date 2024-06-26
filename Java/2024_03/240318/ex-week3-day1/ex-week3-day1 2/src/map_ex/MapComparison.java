package map_ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison {
	public static void main(String[] args) {
		// HashMap Example
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Three", 3);
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		System.out.println("HashMap 순회:");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		// LinkedHashMap Example
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		System.out.println("\nLinkedHashMap 순회:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		// TreeMap Example
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Three", 3);
		treeMap.put("One", 1);
		treeMap.put("Two", 2);
		System.out.println("\nTreeMap 순회:");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}

