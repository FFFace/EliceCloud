import java.io.*;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // 총 동전 + 지폐 수 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        double finalAmount = m;

        for (int i = 0; i < k; i++) {
            finalAmount *= (1 + (double) n / 100.0);
        }

        System.out.println((int) Math.round(finalAmount)); // 소수점 이하는 버리고 반올림
    }
}
