package comparator_ex;

import java.util.Arrays;

public class ComparatorLambdaExample {
	public static void main(String[] args) {
		String[] fruits = {"Pineapple", "Apple", "Orange", "Banana"};

		Arrays.sort(fruits, (fruit1, fruit2) -> fruit1.compareTo(fruit2));

		System.out.println(Arrays.toString(fruits));
	}
}

