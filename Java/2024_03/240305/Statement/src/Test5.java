import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade >= 70) {
            System.out.println("합격입니다.");
            if (grade >= 90) {
                System.out.println("장학금도 받을 수 있습니다.");
            }
        } else {
            System.out.println("불합격입니다.");
        }
    }
}
