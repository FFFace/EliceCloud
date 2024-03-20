package foreach;

import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> strings = List.of("I", "am", "a", "elice", "racer");
		for(String s : strings) {
			System.out.println(s);
		}

		strings.forEach(s -> System.out.println(s));
		// method reference:
		strings.forEach(System.out::println);

	}
}
