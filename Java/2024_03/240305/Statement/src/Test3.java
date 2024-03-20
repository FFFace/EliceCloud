import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        char gradeAlp = 'F';
        if (grade >= 90) {
            gradeAlp = 'A';
        } else if (grade >= 80) {
            gradeAlp = 'B';
        } else if (grade >= 70) {
            gradeAlp = 'C';
        } else if (grade >= 60) {
            gradeAlp = 'D';
        }

        System.out.println("학점은 " + gradeAlp + "입니다.");
    }
}
