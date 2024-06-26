package stream_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx01 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

		// 스트림을 사용하여 "C"로 시작하는 이름만 필터링하고 대문자로 변환
		List<String> filteredNames = names.stream() // 스트림 생성
			.filter(name -> name.startsWith("C")) // 필터링
			.map(String::toUpperCase) // 대문자로 변환
			.collect(Collectors.toList()); // 결과를 리스트로 수집

		System.out.println(filteredNames); // 출력: [CHARLIE]
	}
}
