package exception_ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
		}
	}
}

