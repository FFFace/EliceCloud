package innerclass.static_inner;

public class Library {
	private String libraryName;

	public Library(String libraryName) {
		this.libraryName = libraryName;
	}

	// 도서 정보를 저장하는 정적 내부 클래스
	public static class Book {
		private String title;
		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}

		public void printBookInfo() {
			System.out.println("제목: " + this.title + ", 저자: " + this.author);
		}
	}

	public static void main(String[] args) {
		// 정적 내부 클래스인 Book 인스턴스 생성
		Book book1 = new Library.Book("디자인 패턴", "GoF");
		Book book2 = new Library.Book("이펙티브 자바", "조슈아 블로크");

		// 책 정보 출력
		book1.printBookInfo();
		book2.printBookInfo();
	}
}

