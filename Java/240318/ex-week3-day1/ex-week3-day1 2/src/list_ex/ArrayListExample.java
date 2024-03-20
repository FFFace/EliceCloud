package list_ex;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("elice");
		names.add("Bob");
		names.add("Charlie");
		names.add("elice"); // 중복 허용

		for (String name : names) {
			System.out.println(name);
		}
	}
}
