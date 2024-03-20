package quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class filter {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("","Sunny", "Rain", "Snow", "");
		Stream<String> filtered = strings.stream().filter(s -> !s.isEmpty());
		filtered.forEach(System.out::println); // 비어 있지 않은 문자열만 출력
	}
}
