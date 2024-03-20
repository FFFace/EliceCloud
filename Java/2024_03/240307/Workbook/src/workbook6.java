import java.util.Scanner;

public class workbook6 {
    public static int getSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        // Scanner는 값을 입력 받을 때 사용합니다.
        // 아래 콘솔창에 값을 쓰고 엔터를 눌러 입력하세요.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        System.out.println(getSquare(n));
    }
}
