package innerclass.instance_inner;

public class InstanceInner2Outer {
	private String outerField = "외부 클래스 필드";
	private InnerClass innerInstance; // 내부 클래스의 인스턴스를 참조할 필드

	// 외부 클래스의 생성자
	public InstanceInner2Outer(String innerFieldValue) {
		// 외부 클래스 생성자에서 내부 클래스 인스턴스 생성
		this.innerInstance = new InnerClass(innerFieldValue);
	}

	// 인스턴스 내부 클래스
	class InnerClass {
		private String innerField;

		public InnerClass(String innerField) {
			this.innerField = innerField;
			System.out.println("InnerClass 생성자 호출: " + innerField);
		}

		public void displayFields() {
			System.out.println("외부 필드: " + outerField);
			System.out.println("내부 필드: " + innerField);
		}
	}

	// 내부 클래스 인스턴스에 접근하여 메소드 호출하는 외부 클래스 메소드
	public void displayInnerFields() {
		innerInstance.displayFields();
	}

	public static void main(String[] args) {
		// 외부 클래스의 인스턴스 생성 시 내부 클래스의 인스턴스도 함께 생성
		InstanceInner2Outer outer = new InstanceInner2Outer("내부 클래스 초기값");
		outer.displayInnerFields();
	}
}
