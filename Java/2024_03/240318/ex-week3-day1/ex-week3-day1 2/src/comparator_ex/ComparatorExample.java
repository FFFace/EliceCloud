package comparator_ex;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
	public static void main(String[] args) {
		String[] fruits = {"Pineapple", "Apple", "Orange", "Banana"};

		Arrays.sort(fruits, new Comparator<String>() {
			@Override
			public int compare(String fruit1, String fruit2) {
				return fruit1.compareTo(fruit2);
			}
		});

		System.out.println(Arrays.toString(fruits));
	}
}

