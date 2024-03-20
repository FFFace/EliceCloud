package workbook6;

class Student {
    int number;
    String name;
    // 지시사항 1번을 참고하여 코드를 작성하세요.
    private int score;

    void study() {
        System.out.println(number + ", " + name + " Studying");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int number, String name) {
        this.number = number;
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return this.score;
    }
    // 지시사항 2번을 참고하여 작성하세요.
    public void setScore(int score) {
        if(score < 0 || score > 100) System.out.println("잘못된 점수입니다!");
        else this.score = score;
    }
}

public class Main {
    public static void main(String args[]) {
        Student student = new Student(1000, "Elice");
        // 지시사항 3번을 참고하여 작성하세요.
        student.setScore(1000); //성적 조작!!!

        System.out.println(student.number + "번 " + student.name + "학생의 성적은 " + student.getScore() + "점입니다.");
    }
}