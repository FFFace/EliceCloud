import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        int korean = scanner.nextInt();
        int english = scanner.nextInt();
        int math = scanner.nextInt();
        int history = scanner.nextInt();

        System.out.println((korean+english+math+history)/4);
        System.out.println((korean+english+math+history)/4.0);
    }
}