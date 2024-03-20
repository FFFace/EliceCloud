package encapsulation.ex01;

public class Ex01Person {
	public String name; // private 접근 제한자를 사용하여 정보 은닉

	// name 필드값을 가져오는 public 메서드
	public String getName() {
		return name;
	}

	// // name 필드값을 설정하는 public 메서드
	public void changeName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("이름은 null일 수 없습니다.");
		}
		this.name = name; // 유효성 검사 등의 로직을 추가할 수 있음
	}
}

