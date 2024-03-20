package workbook7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] originalPotions = {"힘증강", "신속", "재생", "투명화", "점프력증가", "화염저항"};

        // 지시사항 2번을 참고하여 코드를 작성하세요.
        System.out.print("몇 개의 포션을 혼합하시겠습니까? ");
        int num = scanner.nextInt();

        // 배열을 무작위로 섞는 로직
        shuffleArray(originalPotions, random);

        // 지시사항 3번을 참고하여 코드를 작성하세요.
        String[] randomPotions = new String[3];
        System.arraycopy(originalPotions, 0, randomPotions, 0, num);

        // 지시사항 4번을 참고하여 코드를 작성하세요.
        System.out.println("혼합된 포션: " + Arrays.toString(randomPotions));
    }

    // 배열을 무작위로 섞는 로직
    public static void shuffleArray(String[] array, Random rnd) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}
