package set_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// 리스트
		ArrayList<String> list = new ArrayList<>(List.of("Ada", "Bash", "C", "Dart", "Elixir", "Fortran", "Groovy",
			"Haskell", "Io", "Java", "Kotlin", "Lua", "MATLAB", "Nim", "OCaml", "Perl", "Q", "Rust",
			"Scala", "TypeScript", "UnrealScript", "V", "WebAssembly", "X++", "YQL", "Z shell",
			"Ada", "TypeScript", "Java", "Java", "Elixir", "Lua"));

		// 리스트로 셋을 생성
		TreeSet<String> set = new TreeSet<>(list);
		// 다시 셋으로 리스트 생성
		list = new ArrayList<>(set);

		for (String e : list) {
			System.out.println(e);
		}

	}
}
