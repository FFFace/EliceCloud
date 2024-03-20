package overloading_riding;

public class ScientificCalculator extends BasicCalculator{
	@Override
	public int add(int a, int b) {
		System.out.println("ScientificCalculator 의 add(int a, int b)실행");
		return a + b;
	}
}
