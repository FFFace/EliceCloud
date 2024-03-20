package quiz;

import java.util.List;

public class StringJoin {
	public static void main(String[] args) {
		String[] words = {"elice", "racer", "is", "awesome"};
		String message = String.join(" ", words);
		System.out.println(message);

		String msg2 = String.join(" ", "elice", "racer", "is", "awesome");
		System.out.println("msg2:"+ msg2);

		List<String> strings = List.of("Java", "is", "cool");
		String message3 = String.join(" ", strings);
		System.out.println("message3:"+ message3);






	}
}
