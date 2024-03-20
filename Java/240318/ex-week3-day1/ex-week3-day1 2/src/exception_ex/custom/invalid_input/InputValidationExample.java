package exception_ex.custom.invalid_input;

public class InputValidationExample {
	public static void main(String[] args) {
		try {
			validateInput("someInput");
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}
	}

	static void validateInput(String input) throws InvalidInputException {
		if (input == null || input.isEmpty()) {
			throw new InvalidInputException("입력이 유효하지 않습니다.");
		}
		System.out.println("유효한 입력: " + input);
	}
}
