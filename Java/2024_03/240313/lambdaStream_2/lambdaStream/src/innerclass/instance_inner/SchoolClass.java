package innerclass.instance_inner;
/*인스턴스 내부 클래스*/
public class SchoolClass {
	private String className; // 학급 이름

	// 외부 클래스의 생성자
	public SchoolClass(String className) {
		this.className = className;
	}

	// 학급 이름을 반환하는 메소드
	public String getClassName() {
		return className;
	}

	// 인스턴스 내부 클래스로 학생을 정의
	class Student {
		private String studentName; // 학생 이름

		// 내부 클래스의 생성자
		public Student(String studentName) {
			this.studentName = studentName;
		}

		// 학생 정보를 출력하는 메소드
		public void printStudentInfo() {
			System.out.println("학급 이름: " + SchoolClass.this.className);
			System.out.println("학생 이름: " + this.studentName);
		}
	}

	public static void main(String[] args) {
		// 학급 인스턴스 생성
		SchoolClass myClass = new SchoolClass("3학년 2반");

		// 학급 인스턴스를 통해 학생 인스턴스 생성
		Student student1 = myClass.new Student("김철수");
		Student student2 = myClass.new Student("이영희");

		// 학생 정보 출력
		student1.printStudentInfo();
		student2.printStudentInfo();
	}
}
