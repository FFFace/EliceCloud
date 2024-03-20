package workbook4;

class Problem{
    String question;
    Integer answer;

    public Problem(String question, Integer answer){
        this.question = question;
        this.answer = answer;
    }

    public void printDetails(){
        System.out.println("질문: " + question);
        System.out.println("정답: " + answer);
    }
}

class ShapeProblem extends Problem{

    String shape;
    public ShapeProblem(String question, Integer answer, String shape) {
        super(question, answer);
        this.shape = shape;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("모양: " + shape);
    }
}

public class Main {
    public static void main(String args[]) {
        Problem problem = new Problem("5+5는?", 10);
        problem.printDetails();

        ShapeProblem shapeProblem = new ShapeProblem("다음 도형의 이름과 넓이를 구하시오.", 78, "Circle");
        shapeProblem.printDetails();
    }
}
