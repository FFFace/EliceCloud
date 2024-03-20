import java.util.Scanner;

public class workbook7 {
    public static void printHello(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("Hello, Elice!");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //Hello, Elice! 를 출력할 횟수를 입력받습니다.

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        printHello(n);
    }
}
